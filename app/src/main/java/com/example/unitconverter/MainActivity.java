package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    EditText editF;
    EditText editC;
    EditText editKm;
    EditText editMi;
    EditText editKg;
    EditText editLb;
    EditText editLtr;
    EditText editGal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editF = findViewById(R.id.editF);
        editC = findViewById(R.id.editC);
        editKm = findViewById(R.id.editKm);
        editMi = findViewById(R.id.editMi);
        editKg = findViewById(R.id.editKg);
        editLb = findViewById(R.id.editLb);
        editLtr = findViewById(R.id.editLtr);
        editGal = findViewById(R.id.editGal);


        editF.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String strF = s.toString();
                Log.i("UnitConverter", "Value in editF = " + strF);

                if (!editF.isFocused()) return;
                if (strF.length() == 0) return;

                try {
                    double f = Double.parseDouble(strF);
                    double c = (f - 32.0) * (5.0/9.0);
                    MainActivity.this.editC.setText(Double.toString(c));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        editC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String strC = s.toString();
                Log.i("UnitConverter", "Value in editC = " + strC);

                if (!editC.isFocused()) return;
                if (strC.length() == 0) return;

                try {
                    double c = Double.parseDouble(strC);
                    double f = (c * 9.0/5.0) + 32.0;
                    MainActivity.this.editF.setText(Double.toString(f));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        editKg.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String strKg = s.toString();
                Log.i("UnitConverter", "Value in editKg = " + strKg);

                if (!editKg.isFocused()) return;
                if (strKg.length() == 0) return;

                try {
                    double kg = Double.parseDouble(strKg);
                    double lbs = kg * 2.205;
                    MainActivity.this.editLb.setText(Double.toString(lbs));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        editLb.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String strLbs = s.toString();
                Log.i("UnitConverter", "Value in editLb = " + strLbs);

                if (!editLb.isFocused()) return;
                if (strLbs.length() == 0) return;

                try {
                    double lbs = Double.parseDouble(strLbs);
                    double kg= lbs/2.205;
                    MainActivity.this.editKg.setText(Double.toString(kg));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        editKm.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String strKm = s.toString();
                Log.i("UnitConverter", "Value in editKm = " + strKm);

                if (!editKm.isFocused()) return;
                if (strKm.length() == 0) return;

                try {
                    double km = Double.parseDouble(strKm);
                    double mi = km / 1.609;
                    MainActivity.this.editMi.setText(Double.toString(mi));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        editMi.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String strMi = s.toString();
                Log.i("UnitConverter", "Value in editMi = " + strMi);

                if (!editMi.isFocused()) return;
                if (strMi.length() == 0) return;

                try {
                    double mi = Double.parseDouble(strMi);
                    double km = mi * 1.609;
                    MainActivity.this.editKm.setText(Double.toString(km));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        editLtr.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String strLtr = s.toString();
                Log.i("UnitConverter", "Value in editLtr = " + strLtr);

                if (!editLtr.isFocused()) return;
                if (strLtr.length() == 0) return;

                try {
                    double ltr = Double.parseDouble(strLtr);
                    double gal = ltr / 3.785;
                    MainActivity.this.editGal.setText(Double.toString(gal));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        editGal.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String strGal = s.toString();
                Log.i("UnitConverter", "Value in editGal = " + strGal);

                if (!editGal.isFocused()) return;
                if (strGal.length() == 0) return;

                try {
                    double gal = Double.parseDouble(strGal);
                    double ltr = gal * 3.785;
                    MainActivity.this.editLtr.setText(Double.toString(ltr));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
