package com.example.hangman;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Vibrator vibrator;
    Spinner spinner;
    TextView hangWord, txtLetters, txtGuessed, txtWrong, txtHangman;
    DatabaseReference reff = FirebaseDatabase.getInstance().getReference();
    int  i = 0, guessed, wrong, position, numberOfWords, randomPosition;
    String toFind = "", found = "", foundh = "", toFindR, guessedLetters = "";
    ArrayList <String> themes = new ArrayList<String>();


    
    boolean newW = false, realCall = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);

        themes.add("Biology");
        themes.add("Computers");
        themes.add("Engineering");
        themes.add("Physics");
        themes.add("Psychology");

        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this, android.R.layout.simple_spinner_item, themes);
        adapter.setDropDownViewResource((android.R.layout.simple_spinner_item));
        spinner.setAdapter(adapter);


        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        hangWord = findViewById(R.id.hangWord);
        txtGuessed = findViewById(R.id.txtGuess);
        txtLetters = findViewById(R.id.txtLetters);
        txtWrong = findViewById(R.id.txtWrong);
        txtHangman = findViewById(R.id.txtHangman);

        Button bttA = findViewById(R.id.buttonA);
        Button bttB = findViewById(R.id.buttonB);
        Button bttC = findViewById(R.id.buttonC);
        Button bttD = findViewById(R.id.buttonD);
        Button bttE = findViewById(R.id.buttonE);
        Button bttF = findViewById(R.id.buttonF);
        Button bttG = findViewById(R.id.buttonG);
        Button bttH = findViewById(R.id.buttonH);
        Button bttI = findViewById(R.id.buttonI);
        Button bttJ = findViewById(R.id.buttonJ);
        Button bttK = findViewById(R.id.buttonK);
        Button bttL = findViewById(R.id.buttonL);
        Button bttM = findViewById(R.id.buttonM);
        Button bttN = findViewById(R.id.buttonN);
        Button bttO = findViewById(R.id.buttonO);
        Button bttP = findViewById(R.id.buttonP);
        Button bttQ = findViewById(R.id.buttonQ);
        Button bttR = findViewById(R.id.buttonR);
        Button bttS = findViewById(R.id.buttonS);
        Button bttT = findViewById(R.id.buttonT);
        Button bttU = findViewById(R.id.buttonU);
        Button bttV = findViewById(R.id.buttonV);
        Button bttW = findViewById(R.id.buttonW);
        Button bttX = findViewById(R.id.buttonX);
        Button bttY = findViewById(R.id.buttonY);
        Button bttZ = findViewById(R.id.buttonZ);
        Button btta = findViewById(R.id.buttona);
        Button bttb = findViewById(R.id.buttonQuestion);

        Button newWord = findViewById(R.id.newWord);

        bttA.setOnClickListener(this);
        bttB.setOnClickListener(this);
        bttC.setOnClickListener(this);
        bttD.setOnClickListener(this);
        bttE.setOnClickListener(this);
        bttF.setOnClickListener(this);
        bttG.setOnClickListener(this);
        bttH.setOnClickListener(this);
        bttI.setOnClickListener(this);
        bttJ.setOnClickListener(this);
        bttK.setOnClickListener(this);
        bttL.setOnClickListener(this);
        bttM.setOnClickListener(this);
        bttN.setOnClickListener(this);
        bttO.setOnClickListener(this);
        bttP.setOnClickListener(this);
        bttQ.setOnClickListener(this);
        bttR.setOnClickListener(this);
        bttS.setOnClickListener(this);
        bttT.setOnClickListener(this);
        bttU.setOnClickListener(this);
        bttV.setOnClickListener(this);
        bttW.setOnClickListener(this);
        bttX.setOnClickListener(this);
        bttY.setOnClickListener(this);
        bttZ.setOnClickListener(this);
        btta.setOnClickListener(this);
        bttb.setOnClickListener(this);
        newWord.setOnClickListener(this);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                toFind = "";
                reset();

                position = i;
                newWord();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    public void wrong() throws InterruptedException {

       vibrator.vibrate(150);
       Thread.sleep(50);
       vibrator.vibrate(150);

    }

    public void showWord(){

        foundh = "";

        for(i = 0; i < toFindR.length(); i++){

            foundh += toFindR.charAt(i);
            foundh += " ";

        }

        hangWord.setText(foundh);

    }

    @Override
    public void onClick(View button) {


            newW = false;
            char c = Character.MIN_VALUE;

            switch (button.getId()) {

                case R.id.buttonA:
                    c = 'a';
                    break;

                case R.id.buttonB:
                    c = 'b';
                    break;

                case R.id.buttonC:
                    c = 'c';
                    break;

                case R.id.buttonD:
                    c = 'd';
                    break;

                case R.id.buttonE:
                    c = 'e';
                    break;

                case R.id.buttonF:
                    c = 'f';
                    break;

                case R.id.buttonG:
                    c = 'g';
                    break;

                case R.id.buttonH:
                    c = 'h';
                    break;

                case R.id.buttonI:
                    c = 'i';
                    break;

                case R.id.buttonJ:
                    c = 'j';
                    break;

                case R.id.buttonK:
                    c = 'k';
                    break;

                case R.id.buttonL:
                    c = 'l';
                    break;

                case R.id.buttonM:
                    c = 'm';
                    break;

                case R.id.buttonN:
                    c = 'n';
                    break;

                case R.id.buttonO:
                    c = 'o';
                    break;

                case R.id.buttonP:
                    c = 'p';
                    break;

                case R.id.buttonQ:
                    c = 'q';
                    break;

                case R.id.buttonR:
                    c = 'r';
                    break;

                case R.id.buttonS:
                    c = 's';
                    break;

                case R.id.buttonT:
                    c = 't';
                    break;

                case R.id.buttonU:
                    c = 'u';
                    break;

                case R.id.buttonV:
                    c = 'v';
                    break;

                case R.id.buttonW:
                    c = 'w';
                    break;

                case R.id.buttonX:
                    c = 'x';
                    break;

                case R.id.buttonY:
                    c = 'y';
                    break;

                case R.id.buttonZ:
                    c = 'z';
                    break;

                case R.id.buttona:
                    c = '-';
                    break;

                case R.id.buttonQuestion:
                    c = '?';
                    break;

                case R.id.newWord:
                    newW = true;
                    newWord();
                    break;

            }

            if (guessed != toFindR.length() && wrong < 8) {

                if (!newW) {
                    try {
                        checkLetter(c);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }else if(guessed == toFindR.length())
                Toast.makeText(this, "You already won!", Toast.LENGTH_SHORT).show();
            else if(wrong > 7)
                Toast.makeText(this, "You lost!", Toast.LENGTH_SHORT).show();

    }

    public void newWord(){

        reset();

        realCall = true;

        reff.child(themes.get(position))
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        numberOfWords = (int) dataSnapshot.getChildrenCount();
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });

            reff.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    toFind = (String) dataSnapshot.child(themes.get(position)).child(Integer.toString((int) (Math.random() * numberOfWords) + 1)).getValue();
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            toFindR = toFind;

            for (i = 0; i < toFindR.length(); i++) {

                found += "_ ";

            }


            if(toFindR.length() > 0) {

                for (i = 0; i < toFind.length() / 4; i++) {

                    foundh = "";

                    randomPosition = (int) (Math.random() * toFind.length());

                    foundh += found.substring(0, randomPosition * 2);
                    foundh += toFindR.charAt(randomPosition);
                    foundh += found.substring(randomPosition * 2 + 1, toFindR.length() * 2);

                    found = foundh;
                    guessed++;
                }
                found = "";
            }

            txtGuessed.setText("Guessed: " + guessed);
            txtLetters.setText("#Letters: " + toFindR.length());
            hangWord.setText(foundh);
            realCall = false;

    }

    public void checkLetter(char c) throws InterruptedException {

        if(!alreadyGuessed(c)) {

            boolean bWrong = true;
            found = "";

            for (i = 0; i < toFindR.length(); i++) {

                if (c == Character.toLowerCase(toFindR.charAt(i))) {


                    if(Character.toUpperCase(c) != foundh.charAt(2 * i) && Character.toLowerCase(c) != foundh.charAt(2 * i)) {
                        guessed++;
                        Toast.makeText(this, "You got a letter", Toast.LENGTH_SHORT).show();

                    }

                    bWrong = false;

                    if (i == 0)
                        found += (char) (c - 32);
                    else
                        found += c;

                    found += " ";

                } else {
                    found += foundh.charAt(2 * i);
                    found += " ";
                }
            }


            guessedLetters += c;

            if (bWrong) {

                Toast.makeText(this, c + " is not in the word", Toast.LENGTH_SHORT).show();
                wrong++;
                wrong();
                hang(wrong);

            }

            foundh = found;

            hangWord.setText(foundh);
            txtGuessed.setText("Guessed: " + guessed);
            txtWrong.setText("Wrong: " + wrong);

            if (guessed == toFindR.length() && guessed > 0)
                Toast.makeText(this, "You won!", Toast.LENGTH_LONG).show();

            if(wrong == 8) {
                Toast.makeText(this, "You lost!", Toast.LENGTH_LONG).show();
                showWord();
            }

        }else
            Toast.makeText(this, c + " was already guessed", Toast.LENGTH_LONG).show();


    }

    public boolean alreadyGuessed(char c){

        boolean already = false;

        for(int j = 0; j < guessedLetters.length(); j++){

            if(c == guessedLetters.charAt(j))
                already = true;

        }

        return already;

    }

    public void hang(int x){

        switch(x){
            case 1:
                txtHangman.setText("----\n|\n|\n|");
                break;

            case 2:
                txtHangman.setText("----|\n|\n|\n|");
                break;

            case 3:
                txtHangman.setText("----|\n|   o\n|\n|");
                break;

            case 4:
                txtHangman.setText("----|\n|   o\n|    |\n|");
                break;

            case 5:
                txtHangman.setText("----|\n|   o\n|  /|\n|");
                break;

            case 6:
                txtHangman.setText("----|\n|   o\n|  /|\\\n|");
                break;

            case 7:
                txtHangman.setText("----|\n|   o\n|  /|\\\n|  /");
                break;

            case 8:
                txtHangman.setText("----|\n|   o\n|  /|\\\n|  / \\");
                break;


        }

    }

    public void reset(){

        found = "";
        foundh = "";
        toFindR = "";
        guessedLetters = "";

        guessed = 0;
        wrong = 0;
        randomPosition = 0;

        txtHangman.setText("\n|\n|\n|");
        hangWord.setText("");
        txtLetters.setText("#Letters: ");
        txtGuessed.setText("Guessed: ");
        txtWrong.setText("Wrong: ");

    }

/*    public void updateWithNewList (){

        String words =  "Absolute Zero, Acceleration, Accuracy, Acoustics, Action, Adhesion, Affect, Alteration, Amplitude, Angular, Antiproton, Apparent, Applied, Apply, Aptitude, Aristotle, Aspect, Atmosphere, Atom, Atomic, Attenuate, Attraction, Aviation, Axis\r\n" +
                "Balance, Basic, Bodies, Boson, Branch\r\n" +
                "Calculus, Capacity, Centrifugal, Changes, Chaos, Charge, Chemical, Chromatics, Circular, Collide, Component, Compression, Condensation, Conductivity, Conservation, Constant, Control, Conversion, Copernicus, Cosmology, Curie\r\n" +
                "Damping, Decibel, Density, Dependence, Deposits, Design, Development, Deviation, Diode, Direction, Discipline, Displacement, Distance, Distortion, Disturbance, Doctorate, Drag, Dynamics\r\n" +
                "Effect, Einstein, Elasticity, Electricity, Electromagnetic, Electron, Electronics, Emission, Energy, Engine, Engineer, Entropy, Equation, Equilibrium, Equivalent, Evaporation, Expansion, Experiment, Explosion, External\r\n" +
                "Factor, Fission, Flight, Flow, Fluid, Flying, Focus, Force, Form, Formula, Frequency, Friction, Fulcrum, Fundamental\r\n" +
                "Galileo, Gas, Generate, Geophysics, Gilbert, Graph, Gravitation, Gravity, Guide, Gyroscope\r\n" +
                "Half-life, Harness, Heat, Hertz, Hold, Hydraulics\r\n" +
                "Identical, Impact, Impulse, Incandescent, Inertia, Influence, Innovate, Inquiry, Interaction, Intervening, Invention, Inverse, Investigation, Invisible, Irradiate, Isotope\r\n" +
                "Joule\r\n" +
                "Kaon, Kinetics\r\n" +
                "Laser, Laws, Level, Lift, Light, Liquids, Loft, Lumen\r\n" +
                "Machinery, Magnet, Magnetism, Magnitude, Mass, Mathematics, Matter, Measure, Mechanics, Meteorology, Metrics, Modulate, Molecule, Motion, Movement\r\n" +
                "Navigation, Negative, Newton, Nuclear, Nucleus\r\n" +
                "Objects, Optics, Oscillation, Overload\r\n" +
                "Parallax, Parity, Particle, Performance, Phenomenon, Photon, Piston, Pitch, Plasma, Position, Prediction, Pressure, Principal, Projectile, Propagation, Properties, Proportion, Psi, Pulse\r\n" +
                "Quality, Quandary, Quanta, Quantitative, Quantity, Quantum, Quark\r\n" +
                "Radiation, Radioactivity, Reception, Relationship, Relative, Relativity, Repulsion, Research, Resistance, Resolution, Resonance, Rest, Reversal, Robotic, Rotation\r\n" +
                "Saturation, Scalar, Science, Scientific, Seismology, Semiconductor, Shape, Shift, Newton, Solid, Sonic, Sound, Space, Spectrum, Speed, Standing, Stationary, Statistics, Strain, Stress, Structure, Study, Sublimation, Substance, Surface, Suspension, Symmetry, System\r\n" +
                "Temperature, Tensile, Tension, Theoretical, Theory, Thermal, Thermodynamics, Thrust, Torque, Training, Trajectory, Transformation, Transistor, Transition, Trough, Turning\r\n" +
                "Ultrasonic, Uncertainty, Uniform, Unify, Unique, Unit, Universal, University\r\n" +
                "Vacuum, Value, Vapor, Variable, Variation, Vector, Velocity, Viscosity, Volatile, Voltage, Volume\r\n" +
                "Wave, Weight, White noise\r\n" +
                "X-ray\r\n" +
                "Zone";

        String newS = "";
        String[] list = new String[500];

        int len = 0;
        boolean out = false;

        for(i = 0; i < words.length(); i++) {

            if(!(words.charAt(i) == ',' || words.charAt(i) == ' ' || words.charAt(i) == '\n' || words.charAt(i) == '\r')) {

                newS += words.charAt(i);

            }
        }

        for(int j = 0; j < list.length; j++) {

            for(i = len + 1; i < newS.length(); i++) {

                if(Character.isUpperCase(newS.charAt(i))) {
                    //System.out.println(i);
                    break;

                }

                if(i == newS.length() - 1) {
                    out = true;
                    break;
                }

            }

            if(out)
                list[j] = newS.substring(len, newS.length());
            else
                list[j] = newS.substring(len, i);

            len += list[j].length();

            if(out)
                break;

        }

        for(i = 0; list[i] != null; i++) {

            reff.child(String.valueOf(i + 1)).setValue(list[i]);

        }
    }*/
}