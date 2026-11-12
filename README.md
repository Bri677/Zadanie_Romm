Etap 2

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/tvTytul"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:text="PLANER WYCIECZEK"
        android:textSize="25sp"
        android:textStyle="bold"
        android:textColor="#205C42"
        android:gravity="center"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"/>

    <TextView
        android:id="@+id/tvPodstawowe"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Podstawowe informacje"
        android:textSize="18sp"
        android:textStyle="bold"
        android:layout_marginTop="16dp"
        app:layout_constraintTop_toBottomOf="@id/tvTytul"
        app:layout_constraintStart_toStartOf="parent"/>

    <EditText
        android:id="@+id/eTNazwa"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:hint="Nazwa wycieczki"
        android:inputType="text"
        app:layout_constraintTop_toBottomOf="@id/tvPodstawowe"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"/>

    <EditText
        android:id="@+id/eTMiejsce"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:hint="Miejsce docelowe"
        android:inputType="text"
        app:layout_constraintTop_toBottomOf="@id/eTNazwa"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"/>

    <EditText
        android:id="@+id/eTDni"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:hint="Liczba dni"
        android:inputType="number"
        app:layout_constraintTop_toBottomOf="@id/eTMiejsce"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"/>

    <EditText
        android:id="@+id/eTCena"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:hint="Cena w zł"
        android:inputType="numberDecimal"
        app:layout_constraintTop_toBottomOf="@id/eTDni"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"/>

    <TextView
        android:id="@+id/tvPoziom"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Poziom trudności"
        android:textStyle="bold"
        android:layout_marginTop="8dp"
        app:layout_constraintTop_toBottomOf="@id/eTCena"
        app:layout_constraintStart_toStartOf="parent"/>

    <Spinner
        android:id="@+id/spinnerPoziom"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        app:layout_constraintTop_toBottomOf="@id/tvPoziom"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"/>

    <TextView
        android:id="@+id/tvRodzaj"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Rodzaj wycieczki"
        android:textStyle="bold"
        android:layout_marginTop="8dp"
        app:layout_constraintTop_toBottomOf="@id/spinnerPoziom"
        app:layout_constraintStart_toStartOf="parent"/>

    <RadioGroup
        android:id="@+id/radioRodzaj"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        app:layout_constraintTop_toBottomOf="@id/tvRodzaj"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent">

        <RadioButton
            android:id="@+id/rbGory"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Góry"/>

        <RadioButton
            android:id="@+id/rbMorze"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Morze"/>

        <RadioButton
            android:id="@+id/rbMiasto"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Miasto"/>

    </RadioGroup>

    <TextView
        android:id="@+id/tvTransport"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Transport"
        android:textStyle="bold"
        app:layout_constraintTop_toBottomOf="@id/radioRodzaj"
        app:layout_constraintStart_toStartOf="parent"/>

    <CheckBox
        android:id="@+id/cbSamochod"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Samochód"
        app:layout_constraintTop_toBottomOf="@id/tvTransport"
        app:layout_constraintStart_toStartOf="parent"/>

    <CheckBox
        android:id="@+id/cbAutobus"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Autobus"
        app:layout_constraintTop_toBottomOf="@id/tvTransport"
        app:layout_constraintStart_toEndOf="@id/cbSamochod"/>

    <CheckBox
        android:id="@+id/cbPociag"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Pociąg"
        app:layout_constraintTop_toBottomOf="@id/tvTransport"
        app:layout_constraintStart_toEndOf="@id/cbAutobus"/>

    <Button
        android:id="@+id/btnWyslij"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:text="Dodaj wycieczkę"
        app:layout_constraintTop_toBottomOf="@id/cbSamochod"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"/>

    <TextView
        android:id="@+id/tvLista"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Zapisane wycieczki"
        android:textSize="20sp"
        android:textStyle="bold"
        android:layout_marginTop="12dp"
        app:layout_constraintTop_toBottomOf="@id/btnWyslij"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"/>

    <ListView
        android:id="@+id/listView"
        android:layout_width="0dp"
        android:layout_height="0dp"
        app:layout_constraintTop_toBottomOf="@id/tvLista"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"/>

</androidx.constraintlayout.widget.ConstraintLayout>





ETAP 2

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
import android.widget.ListView;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText eTNazwa, eTMiejsce, eTDni, eTCena;
    RadioGroup radioRodzaj;
    CheckBox cbSamochod, cbAutobus, cbPociag;
    Button btnWyslij;
    Spinner spinnerPoziom;

    WycieczkaDataBase baza;
    ListView listView;
    List<Wycieczka> wycieczkiList;
    ArrayAdapter<Wycieczka> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eTNazwa = findViewById(R.id.eTNazwa);
        eTMiejsce = findViewById(R.id.eTMiejsce);
        eTDni = findViewById(R.id.eTDni);
        eTCena = findViewById(R.id.eTCena);
        listView = findViewById(R.id.listView);

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
        // Pobranie wycieczek z bazy i ustawienie adaptera
        wycieczkiList = baza.zwrocWycieczkiDAO().zwrocWszystkieWycieczki();

        arrayAdapter = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                wycieczkiList
        );

        listView.setAdapter(arrayAdapter);

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
            odswiezListe();
        });
    }
    private void odswiezListe() {
        wycieczkiList.clear();
        wycieczkiList.addAll(baza.zwrocWycieczkiDAO().zwrocWszystkieWycieczki());
        arrayAdapter.notifyDataSetChanged();
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


ETAP 3

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
import android.widget.ListView;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText eTNazwa, eTMiejsce, eTDni, eTCena;
    RadioGroup radioRodzaj;
    CheckBox cbSamochod, cbAutobus, cbPociag;
    Button btnWyslij;
    Spinner spinnerPoziom;

    WycieczkaDataBase baza;
    ListView listView;
    List<Wycieczka> wycieczkiList;
    ArrayAdapter<Wycieczka> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eTNazwa = findViewById(R.id.eTNazwa);
        eTMiejsce = findViewById(R.id.eTMiejsce);
        eTDni = findViewById(R.id.eTDni);
        eTCena = findViewById(R.id.eTCena);
        listView = findViewById(R.id.listView);

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
        // Pobranie wycieczek z bazy i ustawienie adaptera
        wycieczkiList = baza.zwrocWycieczkiDAO().zwrocWszystkieWycieczki();

        arrayAdapter = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                wycieczkiList
        );

        listView.setAdapter(arrayAdapter);

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
            odswiezListe();
        });
        // USUWANIE WYCIECZKI PRZEZ DŁUGIE KLIKNIĘCIE
        listView.setOnItemLongClickListener((parent, view, position, id) -> {

            Wycieczka doUsuniecia = wycieczkiList.get(position);

            baza.zwrocWycieczkiDAO().usunWycieczke(doUsuniecia);

            odswiezListe();

            Toast.makeText(MainActivity.this, "Usunięto wycieczkę!",
                    Toast.LENGTH_SHORT).show();

            return true;
        });
    }
    private void odswiezListe() {
        wycieczkiList.clear();
        wycieczkiList.addAll(baza.zwrocWycieczkiDAO().zwrocWszystkieWycieczki());
        arrayAdapter.notifyDataSetChanged();
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
