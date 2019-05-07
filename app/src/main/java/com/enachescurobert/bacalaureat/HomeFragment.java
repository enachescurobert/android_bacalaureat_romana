package com.enachescurobert.bacalaureat;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class HomeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);



        //Change the text of the @links element
        TextView textView = (TextView) view.findViewById(R.id.links);
        String text = "\t\t\t Scopul acestei aplicații este de a ajuta elevii cu cele mai bune comentarii pentru proba scrisa de la Bacalaureat." +
                "\n" +
                "\t\t\t În clipa de față, comentariile disponibile sunt pentru:" +
                "\n" +
                "\t\t\t\t\t - \"Alexandru Lăpușneanu\" - de Costache Negruzzi" +
                "\n" +
                "\t\t\t\t\t - \"Baltagul\" - de Mihail Sadoveanu" +
                "\n" +
                "\t\t\t\t\t - \"Enigma Otiliei\" - de George Călinescu" +
                "\n" +
                "\t\t\t\t\t - \"Harap Alb\" - de Ion Creangă" +
                "\n" +
                "\t\t\t\t\t - \"Ion\" - de Liviu Rebreanu" +
                "\n" +
                "\t\t\t\t\t - \"Moara Cu Noroc\" - de Ioan Slavici" +
                "\n" +
                "\t\t\t\t\t - \"La Țigănci\" - de Mircea Eliade" +
                "\n" +
                "\t\t\t\t\t - \"Ultima Noapte De Dragoste, Întâia Noapte De Război\" - de Camil Petrescu" +
                "\n" +
                "\t\t\t Vom adauga noi comentarii în versiunile următoare ale aplicației." +
                "\n" +
                "\t\t\t În cazul în care doriți urgent o schimbare, ne puteți da mesaj apăsând pe butonul verde.";

        SpannableString ss = new SpannableString(text);

        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                //Toast.makeText(getActivity(), "Alexandru Lapusneanu", Toast.LENGTH_SHORT).show();
                Fragment lapusneanuFragment = new LapusneanuFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, lapusneanuFragment);
                transaction.addToBackStack(null);
                transaction.commit();


            }

            @Override
            public void updateDrawState( TextPaint ds) {
                super.updateDrawState(ds);
                //change the color
                ds.setColor(Color.DKGRAY);
                //get rid of the underline
                //ds.setUnderlineText(false);
            }
        };

        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                //Toast.makeText(getActivity(), "Baltagul", Toast.LENGTH_SHORT).show();
                Fragment baltagulFragment = new BaltagulFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, baltagulFragment);
                transaction.addToBackStack(null);
                transaction.commit();


            }

            @Override
            public void updateDrawState( TextPaint ds) {
                super.updateDrawState(ds);
                //change the color
                ds.setColor(Color.DKGRAY);
                //get rid of the underline
                //ds.setUnderlineText(false);
            }
        };

        ClickableSpan clickableSpan3 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                //Toast.makeText(getActivity(), "Enigma Otiliei", Toast.LENGTH_SHORT).show();
                Fragment enigmaOtilieiFragment = new EnigmaOtilieiFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, enigmaOtilieiFragment);
                transaction.addToBackStack(null);
                transaction.commit();

            }

            @Override
            public void updateDrawState( TextPaint ds) {
                super.updateDrawState(ds);
                //change the color
                ds.setColor(Color.DKGRAY);
                //get rid of the underline
                //ds.setUnderlineText(false);
            }
        };

        ClickableSpan clickableSpan4 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                //Toast.makeText(getActivity(), "Harap Alb", Toast.LENGTH_SHORT).show();
                Fragment harapAlbFragment = new HarapAlbFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, harapAlbFragment);
                transaction.addToBackStack(null);
                transaction.commit();

            }

            @Override
            public void updateDrawState( TextPaint ds) {
                super.updateDrawState(ds);
                //change the color
                ds.setColor(Color.DKGRAY);
                //get rid of the underline
                //ds.setUnderlineText(false);
            }
        };

        ClickableSpan clickableSpan5 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                //Toast.makeText(getActivity(), "Ion", Toast.LENGTH_SHORT).show();
                Fragment ionFragment = new IonFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, ionFragment);
                transaction.addToBackStack(null);
                transaction.commit();

            }

            @Override
            public void updateDrawState( TextPaint ds) {
                super.updateDrawState(ds);
                //change the color
                ds.setColor(Color.DKGRAY);
                //get rid of the underline
                //ds.setUnderlineText(false);
            }
        };

        ClickableSpan clickableSpan6 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                //Toast.makeText(getActivity(), "Moara cu Noroc", Toast.LENGTH_SHORT).show();
                Fragment moaraFragment = new MoaraFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, moaraFragment);
                transaction.addToBackStack(null);
                transaction.commit();

            }

            @Override
            public void updateDrawState( TextPaint ds) {
                super.updateDrawState(ds);
                //change the color
                ds.setColor(Color.DKGRAY);
                //get rid of the underline
                //ds.setUnderlineText(false);
            }
        };

        ClickableSpan clickableSpan7 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                //Toast.makeText(getActivity(), "La Tiganci", Toast.LENGTH_SHORT).show();
                Fragment tiganciFragment = new TiganciFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, tiganciFragment);
                transaction.addToBackStack(null);
                transaction.commit();

            }

            @Override
            public void updateDrawState( TextPaint ds) {
                super.updateDrawState(ds);
                //change the color
                ds.setColor(Color.DKGRAY);
                //get rid of the underline
                //ds.setUnderlineText(false);
            }
        };

        ClickableSpan clickableSpan8 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                //Toast.makeText(getActivity(), "Ultima Noapte De Dragoste, Intaia Noapte De Razboi", Toast.LENGTH_SHORT).show();
                Fragment ultimaNoapteFragment = new UltimaNoapteFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, ultimaNoapteFragment);
                transaction.addToBackStack(null);
                transaction.commit();

            }

            @Override
            public void updateDrawState( TextPaint ds) {
                super.updateDrawState(ds);
                //change the color
                ds.setColor(Color.DKGRAY);
                //get rid of the underline
                //ds.setUnderlineText(false);
            }
        };

        ss.setSpan(clickableSpan1, text.indexOf("Alexandru"), text.indexOf("\" - de Costa"), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan2, text.indexOf("Baltagul"), text.indexOf("\" - de Miha"), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan3, text.indexOf("Enigma"), text.indexOf("\" - de George"), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan4, text.indexOf("Harap"), text.indexOf("\" - de Ion"), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan5, text.lastIndexOf("Ion"), text.indexOf("\" - de Liviu"), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan6, text.indexOf("Moara"), text.indexOf("\" - de Ioan"), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan7, text.indexOf("La"), text.indexOf("\" - de Mircea"), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan8, text.indexOf("Ultima"), text.indexOf("\" - de Camil"), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);


        //textView.setText(text);

        textView.setText(ss);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        return view;
    }
}
