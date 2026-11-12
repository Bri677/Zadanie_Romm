package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

public class MainActivity extends AppCompatActivity {

    EditText eTNazwa, eTMiejsce, eTDni, eTCena;
    RadioGroup radioRodzaj;
    CheckBox cbSamochod, cbAutobus, cbPociag;
    Button btnWyslij;
    Spinner spinnerPoziom;

    WycieczkaDataBase baza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eTNazwa = findViewById(R.id.eTNazwa);
        eTMiejsce = findViewById(R.id.eTMiejsce);
        eTDni = findViewById(R.id.eTDni);
        eTCena = findViewById(R.id.eTCena);

        radioRodzaj = findViewById(R.id.radioRodzaj);

        cbSamochod = findViewById(R.id.cbSamochod);
        cbAutobus = findViewById(R.id.cbAutobus);
        cbPociag = findViewById(R.id.cbPociag);

        btnWyslij = findViewById(R.id.btnWyslij);
        spinnerPoziom = findViewById(R.id.spinnerPoziom);

        // Spinner - poziom trudności
        String[] poziomy = {"Łatwy", "Średni", "Trudny", "Bardzo trudny"};

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                poziomy
        );
        spinnerAdapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item
        );
        spinnerPoziom.setAdapter(spinnerAdapter);

        // Baza danych Room
        baza = Room.databaseBuilder(
                        getApplicationContext(),
                        WycieczkaDataBase.class,
                        "wycieczki_db"
                )
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();

        // DODAWANIE WYCIECZKI
        btnWyslij.setOnClickListener(v -> {

            String nazwa = eTNazwa.getText().toString().trim();
            String miejsce = eTMiejsce.getText().toString().trim();
            String dniTekst = eTDni.getText().toString().trim();
            String cenaTekst = eTCena.getText().toString().trim();

            if (nazwa.isEmpty() || miejsce.isEmpty()
                    || dniTekst.isEmpty() || cenaTekst.isEmpty()) {
                Toast.makeText(this, "Uzupełnij wszystkie pola!",
                        Toast.LENGTH_SHORT).show();
                return;
            }

            int dni;
            double cena;

            try {
                dni = Integer.parseInt(dniTekst);
                cena = Double.parseDouble(cenaTekst.replace(",", "."));
            } catch (NumberFormatException e) {
                Toast.makeText(this, "Podaj poprawną liczbę dni i cenę!",
                        Toast.LENGTH_SHORT).show();
                return;
            }

            if (dni < 1 || cena < 0) {
                Toast.makeText(this,
                        "Liczba dni musi być większa od 0, a cena nie może być ujemna!",
                        Toast.LENGTH_SHORT).show();
                return;
            }

            int wybranyId = radioRodzaj.getCheckedRadioButtonId();

            if (wybranyId == -1) {
                Toast.makeText(this, "Wybierz rodzaj wycieczki!",
                        Toast.LENGTH_SHORT).show();
                return;
            }

            RadioButton wybranyRadioButton = findViewById(wybranyId);
            String rodzaj = wybranyRadioButton.getText().toString();

            StringBuilder transport = new StringBuilder();
            if (cbSamochod.isChecked()) transport.append("Samochód, ");
            if (cbAutobus.isChecked()) transport.append("Autobus, ");
            if (cbPociag.isChecked()) transport.append("Pociąg, ");

            String poziom = spinnerPoziom.getSelectedItem().toString();

            Wycieczka wycieczka = new Wycieczka(
                    nazwa, miejsce, dni, cena,
                    poziom, rodzaj, transport.toString()
            );

            // Zapis do bazy
            baza.zwrocWycieczkiDAO().wstawWycieczke(wycieczka);

            Toast.makeText(this, "Dodano wycieczkę!",
                    Toast.LENGTH_SHORT).show();

            wyczysc();
        });
    }

    private void wyczysc() {
        eTNazwa.setText("");
        eTMiejsce.setText("");
        eTDni.setText("");
        eTCena.setText("");

        radioRodzaj.clearCheck();

        cbSamochod.setChecked(false);
        cbAutobus.setChecked(false);
        cbPociag.setChecked(false);

        spinnerPoziom.setSelection(0);
    }
}