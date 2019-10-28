package com.pisb.credenz19;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import static com.pisb.credenz19.Main3Activity.eventno;

public class card1contact extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View RootView = inflater.inflate(R.layout.card1contact, container, false);
        TextView tv;
        if(eventno==1) {
            tv = RootView.findViewById(R.id.contacttext);
            tv.setText(Html.fromHtml("Sudhanshu Bhoi:"+"<a href=\"+91 8975167862\"> +91-8975167862</a><br>" +
                    "Neelanjney Pilarisetty:"+"<a href=\"+91 8087084718\"> +91-8087084718</a>"));
        }
        else if(eventno==2)
        {
            tv =RootView.findViewById(R.id.contacttext);
            tv.setText(Html.fromHtml("Isha Pardikar:"+"<a href=\"+91 9309116833\"> +91-9309116833</a>"));
        }
        else if (eventno==3)
        {
            tv =RootView.findViewById(R.id.contacttext);
            tv.setText(Html.fromHtml("Ajay Kadam:"+"<a href=\"+91 8669286645\"> 91-8669286645</a><br>" +
                    "Saumitra Kulkarni:"+"<a href=\"+91 8806850222\">+91-8806850222</a>"));
        }
        else if (eventno==4)
        {
            tv =RootView.findViewById(R.id.contacttext);
            tv.setText(Html.fromHtml("Rajavi Kakade:"+"<a href=\"+91-7798130523\"> +91-7798130523</a><br>" +
                    "Rohit Nagotkar:"+"<a href=\"+91-8668297216\"> +91-8668297216</a>"));
        }
        else if (eventno==5)
        {
            tv =RootView.findViewById(R.id.contacttext);
            tv.setText(Html.fromHtml("Amol Gandhi:"+"<a href=\"+91-928413533\"> +91-928413533</a><br>" +
                    "Piyusha Gumte:"+"<a href=\"++91-7745000663\"> +91-7745000663</a>"));
        }
        else if (eventno==6)
        {
            tv =RootView.findViewById(R.id.contacttext);
            tv.setText(Html.fromHtml("Vansh Kaul:"+"<a href=\"+91-9370663915\"> +91-9370663915</a><br>" +
                    "Hritik Zutshi:"+"<a href=\"+91-7701864159\"> +91-7701864159</a>"));
        }
        else if (eventno==7)
        {
            tv =RootView.findViewById(R.id.contacttext);
            tv.setText(Html.fromHtml("Neelanjney Pilarisetty:"+"<a href=\"+91-8087084718\"> +91-8087084718</a><br>" +
                    "Shraddha Laghate:"+"<a href=\"+91-9623256536\"> +91-9623256536</a>"));
        }
        else if (eventno==8)
        {
            tv =RootView.findViewById(R.id.contacttext);
            tv.setText(Html.fromHtml("Nishita Pali:"+"<a href=\"+91-9579761430\"> +91-9579761430</a><br>" +
                    "Shruti Phadke:"+"<a href=\"+91-9922570384\"> +91-9922570384</a>"));
        }
        else if (eventno==9)
        {
            tv =RootView.findViewById(R.id.contacttext);
            tv.setText(Html.fromHtml("Muskan Jain:"+"<a href=\"+91-9922890798\"> +91-9922890798</a><br>" +
                    "Varun Gattani:"+"<a href=\"+91-9834389992\"> +91-9834389992</a>"));
        }
        else if (eventno==10)
        {
            tv =RootView.findViewById(R.id.contacttext);
            tv.setText(Html.fromHtml("Manav Peshwani:"+"<a href=\"+91-7798401391\"> +91-7798401391</a><br>" +
                    "Purvesh Jain:"+"<a href=\"+91-8275706817\"> +91-8275706817</a>"));
        }
        else if (eventno==11)
        {
            tv =RootView.findViewById(R.id.contacttext);
            tv.setText(Html.fromHtml("Kapil Mirchandani:"+"<a href=\"+91-9923213356\"> +91-9923213356</a><br>" +
                    "Kushal Chordiya:<a href=\"+91-9022149921\"> +91-9022149921</a>"));
        }
        else if (eventno==12)
        {
            tv =RootView.findViewById(R.id.contacttext);
            tv.setText(Html.fromHtml("Sachin Johnson:"+"<a href=\"+91-9075717549\"> +91-9075717549</a><br>" +
                    "Sanya Gulati:"+"<a href=\"+91-9685097707\"> +91-9685097707</a>"));
        }
        else if (eventno==13)
        {
            tv =RootView.findViewById(R.id.contacttext);
            tv.setText(Html.fromHtml("Omkar Deshpande:"+"<a href=\"+91 7709833124\"> +91-7709833124</a><br>" +
                    "Tanmay Nale:"+"<a href=\"+91-9969108722\"> +91-9969108722</a>"));
        }
        else if (eventno==14)
        {
            tv =RootView.findViewById(R.id.contacttext);
            tv.setText(Html.fromHtml("Kushal Chordiya:"+"<a href=\"+91-9022149921\"> +91-9022149921</a><br>" +
                    "Prathamesh Musale:"+"<a href=\"+91-7774964335\"> +91-7774964335</a>"));
        }
        else if (eventno==15)
        {
            tv =RootView.findViewById(R.id.contacttext);
            tv.setText(Html.fromHtml("Bhushan Pagare:"+"<a href=\"+91-9112179178\"> +91-9112179178</a><br>" +
                    "Shreyas Godbole:"+"<a href=\"+91-9910758401\"> +91-9910758401</a>"));
        }
        return RootView;
    }
}
