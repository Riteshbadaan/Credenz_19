package com.pisb.credenz19;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static com.pisb.credenz19.Main3Activity.eventno;

public class card1structure extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View RootView = inflater.inflate(R.layout.card1structure, container, false);
        TextView tv;
        if(eventno==1) {
            tv = RootView.findViewById(R.id.structuretext);
            tv.setText(Html.fromHtml("<b>Round 1: </b>Send your abstract to bplan.credenz19@gmail.com. " +
                    "Top 7 (+3 waiting) teams will be shortlisted for the next round. <br><br>" +
                    "<b>Round 2.1: </b> A 12 minute presentation of your plan to panel of judges and audience. <br><br>" +
                    "<b>Round 2.2: </b> React to a business situation.<br><br>" +
                    "Answer the questions on approaches towards hurdles, opportunities, feasibility, and exit plan. <br><br>" +
                    "Top 3 teams will be awarded with cash prizes. <br>" +
                    "The best team will further get an opportunity to pitch their idea to investors and get incubation at PICT E-Cell."));
        }
        else if(eventno==2)
        {
            tv =RootView.findViewById(R.id.structuretext);
            tv.setText(Html.fromHtml("1. <b>Round 1: </b>" +
                    "Problem Statement will be released on website 15 days prior to the event.<br>" +
                    "Participants have to mail their abstract to email id:<br>" +
                    "contraption.credenz19@gmail.com<br><br>" +
                    "2. <b>Round 2: </b>" +
                    "Best abstracts will be shortlisted from the first round. These teams will be allowed to " +
                    "come to college and demonstrate their machine and present their innovation."));
        }
        else if (eventno==3)
        {
            tv =RootView.findViewById(R.id.structuretext);
            tv.setText(Html.fromHtml("1. There are TWO rounds per group: <br>" +
                    "1.1. <b>Elimination Round (MCQ's Round)</b><br>" +
                    "1.2. <b>Coding Round (Final Round)</b><br><br>" +
                    "2. Owing to the vast nature of the programming language, the event will be " +
                    "conducted in two categories, Junior Level and Senior Level.<br><br>" +
                    "3. The competition will test the participants' programming skills and knowledge of C/C++ and Python.<br><br>" +
                    "4. Python Language option will be available only for First Year (FE) participants.<br><br>" +
                    "5. Teams can register at the registration desk on the day of the event, " +
                    "1 hour prior to the event. Teams can also register at desks put up at various colleges in Pune.<br><br>" +
                    "6. The Second Round structure will be declared on the spot. <br><br>" +
                    "7. NOTE: Only one computer will be provided to each team."));
        }
        else if (eventno==4)
        {
            tv =RootView.findViewById(R.id.structuretext);
            tv.setText(Html.fromHtml("<b>Round 1: </b>(Junior and Senior)<br>" +
                    "It will consist of Multiple Choice Questions (MCQs) from different categories. " +
                    " There will be 30 questions for a time limit of 30 minutes.<br><br>" +
                    "<b>Round 2: </b>(Junior and Senior)<br>" +
                    "The participants will be given a problem statement and they are supposed to " +
                    "implement the solution with the help of hardware components (simulation software " +
                    "proteus for senior round)"));
        }
        else if (eventno==5)
        {
            tv =RootView.findViewById(R.id.structuretext);
            tv.setText(Html.fromHtml("1. To start  the hunt, visit "+"<a href=\"http://nth.credenz.in\">http://nth.credenz.in</a><br><br>" +
                    "2. Register to get your NTH username.<br><br>" +
                    "3. You will be directed to the starting page of the hunt.<br><br>" +
                    "4. To advance, crack the question ,and put answer in the URL:FROM "+"<a href=\"http://nth.credenz.in/question.php\">http://nth.credenz.in/question.php</a> TO "+"<a href=\"http://nth.credenz.in/answer.php\">http://nth.credenz.in/answer.php</a><br><br>" +
                    "5. Check the source of the pages,  you'll get some important clues for hunting further. Dont forget to check the titles too."));
            tv.setMovementMethod(LinkMovementMethod.getInstance());
        }
        else if (eventno==6)
        {
            tv =RootView.findViewById(R.id.structuretext);
            tv.setText(Html.fromHtml("1. There will be three rounds.<br><br>" +
                    "2. You need to qualify the threshold score to get into the next " +
                    "round. The threshold will be decided based upon the performance " +
                    "of all the teams.<br><br>" +
                    "3. No mobile phones or any electronic gadgets are allowed during the " +
                    "event.<br><br>" +
                    "4. The decision of the organizer will be final.<br><br>" +
                    "5. There is no negative marking at any stage.<br><br>" +
                    "• <b>Round 1: </b>" +
                    "1.1. There will be 35 questions in this round. o Time limit is 30 minutes.<br>" +
                    "1.2. For every right answer you will be awarded points and no " +
                    "negative points for a " +
                    "wrong answer. " +
                    "1.3. The marking scheme will be told on " +
                    "the day of the event. " +
                    "1.4. 100 teams will qualify for the " +
                    "second round.<br><br>" +
                    "• <b>Round 2: </b>" +
                    "2.1. There will be 15 questions in this round with a time constraint of 2 " +
                    "minutes for " +
                    "each question.<br>" +
                    "2.2. Each team will be split in this round, and the " +
                    "players will play individually. " +
                    "Each player of a team will play for the same 15 questions.<br>" +
                    "2.3. The " +
                    "scoring will depend on the performance of both the " +
                    "participants.<br> " +
                    "2.4. For a question – If both members answer " +
                    "correctly, 4 points will be awarded. " +
                    "If one member answers correctly, 1 point will be awarded. No points<br>" +
                    "will be awarded in any other case.<br>" +
                    "2.5. 25 teams will qualify for " +
                    "round 3.<br><br>" +
                    "• <b>Round 3: </b>" +
                    "3.1. There will be 5 puzzles in this round. o Time limit is " +
                    "2 hours.<br> " +
                    "3.2. You need to claim whenever you are done.<br>" +
                    "3.3. The earliest claim with maximum right " +
                    "answers, wins"));
        }
        else if (eventno==7)
        {
            tv =RootView.findViewById(R.id.structuretext);
            tv.setText(Html.fromHtml("1. There will be two rounds - one elimination rounds and one final round.<br><br>" +
                    "2. Details about structure of quiz will be provided at the time of the event.<br><br>" +
                    "3. <b>Round 1: </b> Will be an Elimination Round with 20 questions with no negative marking.<br><br>" +
                    "4. <b>Round 2: </b> 8 teams will be short listed for the second round and Final Round which will have 4 Sub rounds. "));
        }
        else if (eventno==8)
        {
            tv =RootView.findViewById(R.id.structuretext);
            tv.setText(Html.fromHtml("<b>ROUND 1: </b><br>" +
                    "1. Each team shall design a promotional poster based on " +
                    "the given theme which " +
                    "will be declared on our website 15 days before the event.<br>" +
                    "2. The date for sending the poster will be declared on the<br>" +
                    "website.<br>3. The designs should be submitted in *.psd, " +
                    "*.cdr, *.ai, etc format. " +
                    "4. The design submitted should not " +
                    "be flattened. " +
                    "5. The brushes and fonts used should be " +
                    "mentioned in the documentation. " +
                    "6. Any external source " +
                    "or images used should also be included in the " +
                    "documentation.<br><br>" +
                    "<b>ROUND 2: </b><br>" +
                    "1. The teams shall be given a topic to design a poster, on " +
                    "the spot. " +
                    "2. The time allotted for this round will be 3 hours.<br>" +
                    "3. You can use the internet for 20 minutes during the " +
                    "competition. Specific time " +
                    "will be allotted for the same.<br>" +
                    "4. You are allowed to get your own brushes, fonts and " +
                    "textures. However, all this " +
                    "will be checked prior to you starting the " +
                    "competition."));
        }
        else if (eventno==9)
        {
            tv =RootView.findViewById(R.id.structuretext);
            tv.setText(Html.fromHtml("1. The duration of each match will be 8 minutes (i.e. two halves, " +
                    "each of 4 mins duration). A 30-seconds break will be given after " +
                    "half time during which the teams will be allowed to attend to " +
                    "their robots.<br><br>" +
                    "2. Each match will be a one-on-one match between two " +
                    "similar teams selected randomly. For scoring system, " +
                    "refer to 8.A.<br>" +
                    "• The team with the highest number of points is the winner of " +
                    "the match. In case of a tie, a penalty shootout will be held, details of " +
                    "which will be announced at the time of the event.<br>" +
                    "• The field will be subjected to changes after the elimination " +
                    "rounds.<br>" +
                    "• The teams will be short-listed for final rounds on the " +
                    "basis of their score in the elimination round.<br>" +
                    "• In final rounds, matches will be one-on-one with a scoring system as " +
                    "in " +
                    "8.B.<br><br>" +
                    "3. SCORING: " +
                    "<b>Elimination round:</b><br> 1. Goal from inner " +
                    "circle: +20 points. <br> 2. Goal from between " +
                    "inner circle and half line: +40 points<br>. 3. Goal " +
                    "from beyond half line: +60 points <br>4. " +
                    "Negative points for Yellow Cards and fouls.<br>" +
                    "5. Disqualification on Red Card.<br><br>" +
                    "Note: This may change at the time of the " +
                    "event<br>" +
                    "Final round: To be declared on the website after " +
                    "elimination round."));
        }
        else if (eventno==10)
        {
            tv =RootView.findViewById(R.id.structuretext);
            tv.setText(Html.fromHtml("1. The event will be conducted within PICT " +
                    "campus on all 3 days.<br><br>" +
                    "2. Every participant will be given virtual money to trade " +
                    "on our virtual stock market.<br><br>" +
                    "3. The event will be conducted on our Android App/Website.<br><br>" +
                    "4. Mock NEWS will be flashed regarding listed companies and " +
                    "their sectors based on which participants will buy/sell stocks to " +
                    "ultimately become the biggest gainer.<br><br>" +
                    "5. Concepts such as IPO, short selling and High " +
                    "Frequency Trading will be inculcated within the event."));
        }
        else if (eventno==11)
        {
            tv =RootView.findViewById(R.id.structuretext);
            tv.setText(Html.fromHtml("1. Submission Procedure: The programmed bots have to be " +
                    "submitted on the website by the last day of submission given " +
                    "on the website.<br><br>" +
                    "2. The rules of the game and details of the interaction of the " +
                    "bot will be with the game description on the Website."));
        }
        else if (eventno==12)
        {
            tv =RootView.findViewById(R.id.structuretext);
            tv.setText(Html.fromHtml("1. Only soft copy i.e. a.pdf file, of " +
                    "the paper and abstract should be " +
                    "submitted. <br><br>" +
                    "2. The paper should not " +
                    "exceed more than 6 pages, " +
                    "Soft copy of the technical paper and " +
                    "the abstract should be mailed to: " +
                    "paper.credenz19@gmail.com<br><br>" +
                    "3. The paper must strictly adhere to the " +
                    "IEEE format<br><br>" +
                    "4. Authors will get 15 minutes to deliver " +
                    "a presentation on their topic followed " +
                    "by a question - answer session<br><br>" +
                    "5. The presentation should be in power " +
                    "point format (.ppt or pptx)."));
        }
        else if (eventno==13)
        {
            tv =RootView.findViewById(R.id.structuretext);
            tv.setText(Html.fromHtml("1. There are two rounds:<br>" +
                    "1.1. <b>Logic Round.</b><br>" +
                    "1.2. <b>Decipher and Code Round.</b><br><br>" +
                    "2. Logic round consists of Logical questions which can be solved by coding. <br>" +
                    "3. In the Decipher and coding round, the participants have to write the code for " +
                    "pattern that maps input to output. <br><br>" +
                    "4. The event will be conducted in two categories:<br>" +
                    "4.1. Junior level (First and Second year)<br>" +
                    "4.2. Senior level (Third and Fourth year).<br><br>" +
                    "5. Teams can register at the registration desk on the day of the event, 1 hour prior " +
                    "to the event. Teams can also register at desks put up at various colleges in Pune.<br><br>" +
                    "6. The Second Round structure will be declared on the spot. <br><br>" +
                    "7. NOTE: Only one computer will be provided to each team."));
        }
        else if (eventno==14)
        {
            tv =RootView.findViewById(R.id.structuretext);
            tv.setText(Html.fromHtml("1. The contest will be hosted on Kaggle, starting from <b>16th September</b>.<br><br>" +
                    "2. The duration of the contest and the round structure " +
                    "will be released soon.<br><br>" +
                    "3. Once the problem statement(s) and the dataset(s) are " +
                    "released, the teams will have to solve the problem and submit the " +
                    "output file on the contest page in the stipulated amount of time.<br><br>" +
                    "4. The submission file format will be specified on the contest page."));
        }
        else if (eventno==15)
        {
            tv =RootView.findViewById(R.id.structuretext);
            tv.setText(Html.fromHtml("<b>ROUND 1: </b><br>" +
                    "1.1. A problem statement shall be given to " +
                    "the participants online.<br>" +
                    "1.2. The problem statement shall be released approximately 20 " +
                    "Days prior on the official website of Credenz '19.<br>" +
                    "1.3. The team should mail the files to " +
                    "webweaver.credenz19@gmail.com in zip archive. (All files " +
                    "with understandable documentation.)<br><br>" +
                    "<b>ROUND 2: </b><br>" +
                    "2.1. The second round shall be conducted at PICT.<br>" +
                    "2.2. Approximately 10 teams shall be shortlisted.<br>" +
                    "2.3. The teams shall be given certain add-ons over the pages designed " +
                    "earlier.<br>" +
                    "2.4 Five add-ons shall be given, specific to the pages " +
                    "designed by the participants."));
        }
        return RootView;
    }
}
