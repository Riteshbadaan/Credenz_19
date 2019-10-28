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

public class card1rules extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View RootView = inflater.inflate(R.layout.card1rules, container, false);
        TextView tv;
        if(eventno==1) {
            tv = RootView.findViewById(R.id.rulestext);
            tv.setText(Html.fromHtml("1. A team of maximum three members (UG/PG) are allowed to participate.<br><br>" +
                    "2. Proposed Business Plan should not violate any intellectual property rights.<br><br>" +
                    "3. All the participants must present a receipt and valid ID during the contest.<br><br>" +
                    "4. Violation of any rule might lead to disqualification of the team at any stage of the competition."));
        }
        else if(eventno==2)
        {
            tv =RootView.findViewById(R.id.rulestext);
            tv.setText(Html.fromHtml("1. A team of max. four members is allowed to participate.<br><br>" +
                    "2. Machine should be of dimensions 8*8*8 feet (maximum).<br><br>" +
                    "3. Minimum 10 steps should be involved to complete the task otherwise " +
                    "team will be disqualified. However there is no constrain on maximum number of steps.<br><br>" +
                    "4. Use memory devices in minimum 3  steps.<br><br>" +
                    "5. Photo should be revealed at the end and not displayed already.<br><br>" +
                    "6. Minimum 4 different energy conversions should be implemented in machine. " +
                    "Otherwise team will be disqualified.<br><br>" +
                    "7. Machine should perform the task in maximum 4 minutes.<br><br>" +
                    "8. Machine should not take support of any four walls and ceiling.<br><br>" +
                    "9. Teams have to submit abstract and flowchart in prescribed format well before " +
                    "the deadline of first round.<br><br>" +
                    "10. Maximum of three trials/chances will be given to any team. For every other " +
                    "chance/trial there will be deduction of points.<br><br>" +
                    "11. For every next chance reset time of 15 minutes will be given to team.<br><br>" +
                    "12. Only one team member is allowed to interact with the machine once the evaluation " +
                    "has begun. This includes resetting the machine during the run. This means only one " +
                    "person will be allowed inside the arena.<br><br>" +
                    "13. However, if the team goes for another run, the restriction of one person inside " +
                    "the arena is uplifted until the machine is ready for the other run.<br><br>" +
                    "14. That person will explain about the machine and each step going on to judges.<br><br>" +
                    "15. Each step in the machine should be considered as the transfer of one energy into " +
                    "another. A step is considered to accomplish when there is energy transformation. Example " +
                    "ball coming down from the wedge and hitting the domino is considered a step. In this " +
                    "potential energy of ball gets converted into kinetic energy while coming down and when " +
                    "it hits the domino, it transfers its energy into domino.<br><br>" +
                    "16. Identical transfers of energy in succession should be considered one step. For eg., " +
                    "a set of dominos falling into each other should be considered one step. While technically " +
                    "each single domino falling is a step, stating one hundred steps for hundred dominos is " +
                    "repetitive and against the spirit of Rube Goldberg.<br><br>" +
                    "17. You can use any material for making of your machine provided in any case, they does " +
                    "not lead damage to arena and other machines. Otherwise it will lead to disqualification of team.<br><br>" +
                    "18. Hazardous materials are not allowed and any gas or any explosives are also not allowed.<br><br>" +
                    "19. We will not provide you any material for making of your Machine.<br><br>" +
                    "20. However basic stationary materials will be provided to you.<br><br>" +
                    "21. You have to bring extension boards of your own.<br><br>" +
                    "22. Bring 2 copies of abstract when you perform in college.<br><br>" +
                    "23. No animal should be used.<br><br>" +
                    "24. Organizers have the right to change a rule or all if they feel."));
        }
        else if (eventno==3)
        {
            tv =RootView.findViewById(R.id.rulestext);
            tv.setText(Html.fromHtml("1. A maximum of 2 candidates pursuing under-graduate program at " +
                    "their institution are allowed per team. <br><br>" +
                    "2. All the participants should bring receipt and valid I-cards while " +
                    "coming for the contest. A participant without an I-card will NOT be allowed " +
                    "for the contest and the respective team will be disqualified.<br><br>" +
                    "3. Marking Scheme will be declared on the spot."));
        }
        else if (eventno==4)
        {
            tv =RootView.findViewById(R.id.rulestext);
            tv.setText(Html.fromHtml("1. Each team can consist of maximum 3 members.<br><br>" +
                    "2. Electronic gadgets are not allowed.<br><br>" +
                    "3. All the participants should bring receipt and valid I-cards while coming for the " +
                    "contest. No one without I-card will be allowed for the contest and the team will be " +
                    "disqualified."));
        }
        else if (eventno==5)
        {
            tv =RootView.findViewById(R.id.rulestext);
            tv.setText(Html.fromHtml("1. Participants playing in a group, if any ,must not play from multiple accounts.<br><br>" +
                    "2. Use of Google and any other website for related searches is permitted."));
        }
        else if (eventno==6)
        {
            tv =RootView.findViewById(R.id.rulestext);
            tv.setText(Html.fromHtml("1. A maximum of two candidates pursuing " +
                    "undergraduate/graduate program at their institution will be " +
                    "allowed per team.<br><br>" +
                    "2. Students with a valid I-card will be allowed for the contest else will " +
                    "lead " +
                    "to disqualification. Each team has to register itself at the registration " +
                    "desk.<br><br>" +
                    "3. All the participants should bring their receipts " +
                    "while coming to the event."));
        }
        else if (eventno==7)
        {
            tv =RootView.findViewById(R.id.rulestext);
            tv.setText(Html.fromHtml("1. A maximum of two candidates pursuing under graduate/graduate program at " +
                    "their institution will be allowed per team.<br><br>" +
                    "2. Teams can register at desks put up at various colleges in and around Pune. No " +
                    "one without I-card will be allowed for the contest and the team will be " +
                    "disqualified. A team has to register itself at registration desk at time of event, one hour prior " +
                    "to the event.<br><br>" +
                    "3. All the participants should bring receipt and valid I-cards while coming for the event."));
        }
        else if (eventno==8)
        {
            tv =RootView.findViewById(R.id.rulestext);
            tv.setText(Html.fromHtml("1. A team of maximum two candidates pursuing undergraduate " +
                    "courses are allowed per team.<br><br>" +
                    "2. Each of the teams should have their own laptops on the day of the " +
                    "event.<br><br>" +
                    "3. All the participants should bring receipt and valid I-cards " +
                    "while coming for the contest. No one without I-card will be " +
                    "allowed for the contest and the team will be disqualified."));
        }
        else if (eventno==9)
        {
            tv =RootView.findViewById(R.id.rulestext);
            tv.setText(Html.fromHtml("1. A maximum of 3 candidates are " +
                    "allowed per team.<br><br>" +
                    "2. Teams can register at the desk put up in various colleges in " +
                    "and around Pune. Teams can also register at the registration desk on " +
                    "the day of the event, at least an hour prior to the event.<br><br>" +
                    "3. ROBOT LIMITATIONS<br><br>" +
                    "3.1. Maximum robot dimensions: 30 cm x 30 cm x 30 cm.<br><br>" +
                    "3.2. Maximum weight 3.5 kg.<br><br>" +
                    "3.3. Power specifications: Max Voltage: 12V . [The participants " +
                    "are allowed to bring their own battery.]<br><br>" +
                    "3.4. The robot cannot split into two independent parts.<br><br>" +
                    "3.5.Robot should be manually controlled and wired.<br><br>" +
                    "3.6. No weapons (blades, spikes) of any kind are to be attached onto the " +
                    "Robot and No programmable bots allowed.<br><br>" +
                    "3.7 The participants are allowed to use " +
                    "any number of actuators.<br><br>" +
                    "3.8. There should be no intentional damage done to the other " +
                    "robot by means of attacking wires, wheels, motors etc.<br><br>" +
                    "3.9. NOTE: Any damage to the field or to the opposing " +
                    "robot would result in immediate disqualification of the team"));
        }
        else if (eventno==10)
        {
            tv =RootView.findViewById(R.id.rulestext);
            tv.setText(Html.fromHtml("1. Every participating candidate should be pursuing " +
                    "Undergraduate/Graduate courses.<br><br>" +
                    "2. All the participants should bring valid I-cards while coming " +
                    "for the contest. No participants without I-card will be allowed for " +
                    "the contest and will be disqualified."));
        }
        else if (eventno==11)
        {
            tv =RootView.findViewById(R.id.rulestext);
            tv.setText(Html.fromHtml("1. A single person is allowed to participate, no teams will be " +
                    "entertained and may lead to disqualification.<br><br>" +
                    "2. Participants need to provide required information on " +
                    "and as and when required.<br><br>" +
                    "3. Any malicious activity encountered by the bot will lead to " +
                    "disqualification.<br><br>" +
                    "4. Participants are allowed to send modified/corrected codes before the " +
                    "last " +
                    "date of submission (Submission dates will be released on the " +
                    "website). Any request for modification of code will not be " +
                    "entertained after that."));
        }
        else if (eventno==12)
        {
            tv =RootView.findViewById(R.id.rulestext);
            tv.setText(Html.fromHtml("1. A team of maximum three<br><br>" +
                    "candidates pursuing undergraduate/" +
                    "postgraduate program are allowed.<br><br>" +
                    "2. All the participants should bring valid " +
                    "I-Cards while coming for the contest. No one without I-Card will be allowed " +
                    "for the contest and the team will be " +
                    "disqualified.<br><br>" +
                    "3. The presentation should not be longer than 10 minutes."));
        }
        else if (eventno==13)
        {
            tv =RootView.findViewById(R.id.rulestext);
            tv.setText(Html.fromHtml("1. A maximum of 2 candidates pursuing under-graduate program at their institution are allowed per team. <br><br>" +
                    "2. All the participants should bring receipt and valid I-cards while " +
                    "coming for the contest. A participant without an I-card will NOT be " +
                    "allowed for the contest and the respective team will be disqualified.<br><br>" +
                    "3. Marking Scheme will be declared on the spot."));
        }
        else if (eventno==14)
        {
            tv =RootView.findViewById(R.id.rulestext);
            tv.setText(Html.fromHtml("1. A maximum of 2 candidates pursuing undergraduate program at their " +
                    "institution are " +
                    "allowed per team.<br><br>" +
                    "2. Disclosing the code and data outside of the teams is " +
                    "prohibited and will lead to disqualification.<br><br>" +
                    "3. Using code and data from any external resource(s) is not " +
                    "permitted and will lead to disqualification.<br><br>" +
                    "4. Round specific rules will be specified on the contest " +
                    "page."));
        }
        else if (eventno==15)
        {
            tv =RootView.findViewById(R.id.rulestext);
            tv.setText(Html.fromHtml("1. A team of maximum 3 is permissible for the event.<br><br>" +
                    "2. Use of any front end framework is permitted.<br><br>" +
                    "3. You are allowed to use any language but readymade " +
                    "template must not be used.<br><br>" +
                    "4. WordPress is not allowed.<br><br>" +
                    "5. All teams shall have to get their own laptops on the day of " +
                    "the competition. It is advisable to get a high speed data card (even " +
                    "though net connection will be provided), for your convenience.<br><br>" +
                    "6. All the participants should bring receipt and valid I-cards " +
                    "while coming for the contest. A single team member without an " +
                    "I-card will result in the disqualification of the entire team."));
        }
        return RootView;
    }
}
