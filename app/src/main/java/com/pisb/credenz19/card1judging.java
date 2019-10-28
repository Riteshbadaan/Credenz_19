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

public class card1judging extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View RootView = inflater.inflate(R.layout.card1judging, container, false);
        TextView tv;
        if(eventno==1) {
            tv = RootView.findViewById(R.id.judgingtext);
            tv.setText(Html.fromHtml("1. Identifies a business opportunity. <br><br>" +
                    "2. Innovation, and Creativity involved. <br><br>" +
                    "3. Technical and Economical Feasibility. <br><br>" +
                    "4. Originality of the idea. <br><br>" +
                    "5. Business Acumen of the Participants. <br>" +
                    "<br>" +
                    "Decisions of the judges will be final and shall be respected. "));
        }
        else if(eventno==2)
        {
            tv =RootView.findViewById(R.id.judgingtext);
            tv.setText(Html.fromHtml("1. Design of your machine.<br><br>" +
                    "2. Number of steps involved in it.<br><br>" +
                    "3. Number of different types of energy conversions involved.<br><br>" +
                    "4. Aesthetic of machine.<br><br>" +
                    "5. Presentation.<br><br>" +
                    "6. Innovation.<br><br>" +
                    "7. Will test elementary knowledge of applied physics of team.<br><br>" +
                    "8. Team management skills will also be tested."));
        }
        else if (eventno==3)
        {
            tv =RootView.findViewById(R.id.judgingtext);
            tv.setText(Html.fromHtml("1. The competition will test participants programming skills and knowledge of C/C++. <br><br>" +
                    "2. Time and cost efficiency of the code."));
        }
        else if (eventno==4)
        {
            tv =RootView.findViewById(R.id.judgingtext);
            tv.setText(Html.fromHtml("<b>Round 1: </b><br>Each question carries a single mark. No negative marking. Teams having score above " +
                    "the score threshold will be selected for Round 2.<br><br>" +
                    "<b>Round 2: </b> <br>Credits will be given based on understanding problem statement, component selection, " +
                    "practical performance and explanation of implemented circuit.<br>" +
                    "<br>" +
                    "Winner and runner-up will be awarded."));
        }
        else if (eventno==5)
        {
            tv =RootView.findViewById(R.id.judgingtext);
            tv.setText(Html.fromHtml("1. The person who cracks the highest number of levels wins.<br><br>" +
                    "2. NOTE: In case of a tie, the one who has reached first on that level wins."));
        }
        else if (eventno==6)
        {
            tv =RootView.findViewById(R.id.judgingtext);
            tv.setText(Html.fromHtml("1. The winner will be selected on the basis of the maximum points " +
                    "scored in final round<br><br>"+
                    "2. NOTE: In case of a tie, the one who has reached first on that level wins."));
        }
        else if (eventno==7)
        {
            tv =RootView.findViewById(R.id.judgingtext);
            tv.setText(Html.fromHtml("The winner will be selected on the basis of the maximum points " +
                    "scored in final round and/or on the exclusive discretion of the quiz master."));
        }
        else if (eventno==8)
        {
            tv =RootView.findViewById(R.id.judgingtext);
            tv.setText(Html.fromHtml("1. Creativity and originality of the design.<br><br>" +
                    "2.  Distinct features incorporated in the design.<br><br>" +
                    "3.  Persuasiveness of the design, i.e. the efficiency of the " +
                    "design to convey the required message.<br><br>" +
                    "4. Photoshop skills.<br><br>" +
                    "5. Layering and masking.<br><br>" +
                    "6. The decision of the judges will be final and shall be " +
                    "respected."));
        }
        else if (eventno==9)
        {
            tv =RootView.findViewById(R.id.judgingtext);
            tv.setText(Html.fromHtml("A yellow card will be flashed on each hand touch after the first " +
                    "one. A maximum of three such cards will add up to a red card i.e. " +
                    "Disqualification. Losing teams may re-register to participate again in " +
                    "the elimination round. Registration fees would be Rs.150/- for this case. " +
                    "(Organizers reserve the rights to close the re- registrations at any point " +
                    "of time). Organizers have the authority to disqualify any team for " +
                    "misconduct or disorderly behaviour. This team would not be allowed to " +
                    "re-register. Organizers " +
                    "reserve the rights to make changes to the field design at any time " +
                    "without prior notification. Participants are requested to refer to the " +
                    "website regularly for any such changes.Organizers' decisions " +
                    "will be final and binding to all.<br><br>" +
                    "NOTE:<br>" +
                    "• All the participants should bring receipt and valid " +
                    "I-cards while coming for the contest.<br><br>" +
                    "• No one without I-card will be allowed for the " +
                    "contest and the team will be disqualified.<br><br>" +
                    "• The participants should carry the same at all times. The " +
                    "organizers reserve the rights for any changes in the rules, if " +
                    "required.<br><br>" +
                    "• The decision of the organizers will be final in all respects during the " +
                    "competition and the participants have to abide by it.<br><br>" +
                    "• If any changes are done in the competition pattern they will be " +
                    "uploaded on " +
                    "the website. For any further information keep checking the website.<br><br>" +
                    "• Any kind of misbehaviour or argument with the " +
                    "organizers, referee or any participants will not be tolerated " +
                    "and may lead to disqualification."));
        }
        else if (eventno==10)
        {
            tv =RootView.findViewById(R.id.judgingtext);
            tv.setText(Html.fromHtml("Top 2 participants with Highest Capital at the end of " +
                    "Day 3 will be declared as winners."));
        }
        else if (eventno==11)
        {
            tv =RootView.findViewById(R.id.judgingtext);
            tv.setText(Html.fromHtml("The rules for scoring and deciding the winner will be " +
                    "mentioned on the website, with the game details."));
        }
        else if (eventno==12)
        {
            tv =RootView.findViewById(R.id.judgingtext);
            tv.setText(Html.fromHtml("1. Oratory and Presentation skills will be " +
                    "of prime importance.<br><br>" +
                    "2. Relevance of the content in context " +
                    "with the chosen topic. Judge's " +
                    "decision will be final and binding on " +
                    "all."));
        }
        else if (eventno==13)
        {
            tv =RootView.findViewById(R.id.judgingtext);
            tv.setText(Html.fromHtml("1. The competition will test participants programming skills and knowledge of C/C++.<br> <br>" +
                    "2. Time and cost efficiency of the code."));
        }
        else if (eventno==14)
        {
            tv =RootView.findViewById(R.id.judgingtext);
            tv.setText(Html.fromHtml("The submissions will be evaluated on the error metric decided for the " +
                    "given dataset. If any two teams perform equally well on the overall " +
                    "score, the tie will be broken by comparing the submission time of both " +
                    "the teams."));
        }
        else if (eventno==15)
        {
            tv =RootView.findViewById(R.id.judgingtext);
            tv.setText(Html.fromHtml("1. Creativity and originality of the design.<br><br>" +
                    "2.  Distinct features incorporated in the design.<br><br>" +
                    "3. Navigation through the site, how well " +
                    "the pages are interconnected.<br><br>" +
                    "4. Persuasiveness of the design, the efficiency of the site to give " +
                    "primary information on the required theme.<br><br>" +
                    "5. Based on your Design, UI/UX and Development.<br><br>" +
                    "6. Additional points will be awarded for backend development."));
        }
        return RootView;
    }
}
