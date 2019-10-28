package com.pisb.credenz19;

import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import static com.pisb.credenz19.Main3Activity.eventno;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class card1intro extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View RootView = inflater.inflate(R.layout.card1intro, container, false);
        TextView tv;
        Log.i("eventno",String.valueOf(eventno));
        if(eventno==1) {
           tv = RootView.findViewById(R.id.introtext);
            tv.setText(Html.fromHtml("Have you always dreamt of having your own business or product ?<br>" +
                    "B-Plan is the perfect platform for you to showcase your ideas before " +
                    "a panel of the best marketing professionals!<br>" +
                    "Make a presentation describing your business idea, and get a chance to " +
                    "win funding from the investors. <br><br>" +
                    "<b>Registration Fees:</b><br>" +
                    "IEEE Members: 120/-<br>" +
                    "Non IEEE Members: 150/-"));
        }
        else if(eventno==2)
        {
            tv =RootView.findViewById(R.id.introtext);
            tv.setText(Html.fromHtml("Have you ever wondered how to apply toothpaste on your brush " +
                    "in 20 steps? Ever wondered how to light a candle in 30 steps? Contraption " +
                    "is all about, complexifying the simplest of " +
                    "things you see around yourself. Its whole essence lies in a perfectly balanced mix of " +
                    "innovation, creativity, relevance which results in profound entertainment.<br><br>" +
                    "<b>Registration Fees:</b><br>" +
                    "IEEE Members: 180/-<br>" +
                    "Non-IEEE Members: 200/-"));
        }
        else if (eventno==3)
        {
            tv =RootView.findViewById(R.id.introtext);
            tv.setText(Html.fromHtml("Put your logical acumen and coding expertise to the " +
                    "test as you clash with a round of perplexing MCQs followed " +
                    "by a set of time-bound coding challenges, carefully designed to " +
                    "assess your command over programming in the language of your choice- Python, C or C++. <br>" +
                    "<br>" +
                    "Showcase your technical proficiency as you have a go at competitive " +
                    "coding with plenty to learn and nothing to lose.<br><br>" +
                    "<b>Registration Fees:</b><br>" +
                    "IEEE Members: 80/- <br>" +
                    "Non-IEEE Members: 100/-"));
        }
        else if (eventno==4)
        {
            tv =RootView.findViewById(R.id.introtext);
            tv.setText(Html.fromHtml("Battle it out on the bread board!<br>" +
                    "<br>" +
                    "Challenge your brains to clear a test where you demonstrate your " +
                    "knowledge in the field of electronics, physics, logical ability and build " +
                    "a circuit by interpreting the hints provided.<br>" +
                    "<br>" +
                    "Prerequisites: Theoretical and practical knowledge in the field of " +
                    "digital electronics, electrical circuits and physics.<br><br>" +
                    "<b>Registration Fees:</b><br>" +
                    "IEEE Members: 120/- per team<br>" +
                    "Non-IEEE Members: 150/- per team"));
        }
        else if (eventno==5)
        {
            tv =RootView.findViewById(R.id.introtext);
            tv.setText(Html.fromHtml("An online treasure hunt where players find different " +
                    "pieces of clues on various websites to solve a variety of puzzles. " +
                    "Solve a set of riddles with important clues and get to the finish line before anyone can.<br>" +
                    "<br>" +
                    "Decrypt the encrypted, go along the trail and race " +
                    "with others to win! This is your chance to know how good " +
                    "you are with web and test your surfing skills. So, log on to our " +
                    "website and solve your way through the questions.<br>" +
                    "<br>" +
                    "To start solving, visit nth.credenz.in <br>" +
                    "<br>" +
                    "<b>Registration Fees:</b> Free!"));
        }
        else if (eventno==6)
        {
            tv =RootView.findViewById(R.id.introtext);
            tv.setText(Html.fromHtml("A non-technical aptitude based event. An event everyone " +
                    "can participate in and enjoy. Enigma presents to its players, " +
                    "an array of brain tickling logical reasoning questions. Put your " +
                    "mind to test and see where you stand among the crowd. May the wittiest triumph.<br><br>" +
                    "<b>Registration Fees:</b><br>" +
                    "IEEE Members: 40/-<br>" +
                    "Non-IEEE Members: 50/-"));
        }
        else if (eventno==7)
        {
            tv =RootView.findViewById(R.id.introtext);
            tv.setText(Html.fromHtml("Get ready to set off on a journey with captivating questions " +
                    "and puzzles on the way, led by a piquant quizmaster. <br>" +
                    "There are three quizzes lying in wait for you:<br>" +
                    "1. General Quiz: Test your knowledge about what's happening in the " +
                    "world in this expansive quiz, ranging from Brexit to Chandrayaan. <br>" +
                    "2. MELA Quiz: The music, entertainment, literature and arts quiz is " +
                    "hardly as easy as it sounds; with questions from Austen's works to the " +
                    "newest Marvel movie, this is definitely for the pop culture buffs. <br>" +
                    "3. Biz Tech Quiz: Bring your A game to this quiz, where the knowledge of " +
                    "marketing, business, economics and the latest technology will come in handy. <br>" +
                    "Can you beat these quizzes or be defeated by our questionnaire? <br><br>" +
                    "<b>Registration Fees:</b><br>" +
                    "IEEE Members: 40/- per quiz<br>" +
                    "Non-IEEE Members: 50/- per quiz"));
        }
        else if (eventno==8)
        {
            tv =RootView.findViewById(R.id.introtext);
            tv.setText(Html.fromHtml("Paint your virtual canvas with the pixels of your artistry. " +
                    "Let creativity fuse with the finesse of your vision as the beauty " +
                    "of design integrates with technology. Come, digitalise your art and " +
                    "let your mouse be your paint brush! <br><br>" +
                    "<b>Registration Fees:</b><br>" +
                    "IEEE Members: 120/-<br>" +
                    "Non IEEE Members: 150/-"));
        }
        else if (eventno==9)
        {
            tv =RootView.findViewById(R.id.introtext);
            tv.setText(Html.fromHtml("For bot-makers and adrenaline chasers, comes an event which " +
                    "will excite and leave you spellbound. Bring your bots and your " +
                    "football skills to the field and battle it out to reign supreme. " +
                    "Watch bots show extreme speed and agility combined with clever tactics " +
                    "to score over their opponents.<br><br>" +
                    "<b>Registration Fees:</b><br>" +
                    "IEEE Members: 160/-<br>" +
                    "Non- IEEE Members: 200/-"));
        }
        else if (eventno==10)
        {
            tv =RootView.findViewById(R.id.introtext);
            tv.setText(Html.fromHtml("Let the rise and fall of market shares bring out your inner businessman!<br>" +
                    "From the chaos due to the fluctuations in Sensex to the never ending trades, " +
                    "get ready to take over the virtual stock market.<br>" +
                    "After all, every investment is one step closer to your dream bank balance!<br><br>" +
                    "<b>Registration Fees:</b><br>" +
                    "IEEE Members: 40/-<br>" +
                    "Non IEEE Members : 50/-"));
        }
        else if (eventno==11)
        {
            tv =RootView.findViewById(R.id.introtext);
            tv.setText(Html.fromHtml("The intense programming competition where you code your bot to fight till the end!<br>" +
                    "Two bots will go head to head against each other in a fierce match. <br>" +
                    "May the best bot win!<br><br>" +
                    "<b>Registration Fees:</b> Free!"));
        }
        else if (eventno==12)
        {
            tv =RootView.findViewById(R.id.introtext);
            tv.setText(Html.fromHtml("An investment in knowledge always pays the best interest. <br>" +
                    "Compete against the most intellectual minds and their progressive ideas!<br>" +
                    "Paper presentation is the perfect platform for undergraduate/postgraduate students to " +
                    "present technical papers with advanced perspectives while honing their skills of research " +
                    "and creating new dimensions of technology!<br><br>" +
                    "<b>Registration Fees:</b><br>" +
                    "IEEE Members: 180<br>" +
                    "Non IEEE Members: 200"));
        }
        else if (eventno==13)
        {
            tv =RootView.findViewById(R.id.introtext);
            tv.setText(Html.fromHtml("A coding competition to test your compilation " +
                    "of the combinations of algorithms and conceptual understanding " +
                    "of the programming languages C/C++. Combine logic and agility to " +
                    "decipher given patterns and code to decode these sequences to find the final answer.<br><br>" +
                    "<b>Registration Fees:</b><br>" +
                    "IEEE Members: 60/-<br>" +
                    "Non IEEE Members: 80/-"));
        }
        else if (eventno==14)
        {
            tv =RootView.findViewById(R.id.introtext);
            tv.setText(Html.fromHtml("Want to step into the world of data science? <br>" +
                    "<br>" +
                    "DataWiz gives you the perfect opportunity to test your machine " +
                    "learning and data analytics skills. Analyse and find inherent patterns " +
                    "in the dataset provided and make predictions with help of the models you make!<br><br>" +
                    "<b>Registration Fees:</b><br>" +
                    "IEEE Members: 80/- <br>" +
                    "Non-IEEE Members: 100/-"));
        }
        else if (eventno==15)
        {
            tv =RootView.findViewById(R.id.introtext);
            tv.setText(Html.fromHtml("An aesthetically pleasing and user-friendly website is necessary to keep visitors engaged online.<br>" +
                    "If you think you have the flair to create such a site, WebWeaver is the competition for you!<br>" +
                    "A perfect integration of technology and creativity will lead you to win this competition.<br>" +
                    "<br>" +
                    "<b>Registration Fees:</b><br>" +
                    "IEEE Members: 120/-<br>" +
                    "Non IEEE Members: 150/-"));
        }
        return RootView;
    }
}
