package com.aj.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.aj.entity.Players;

public class IPL_dao {
	static Map<String, List<Players>> allTeams = new TreeMap<String, List<Players>>();
	
	public Map<String, List<Players>> allteams() {
		List<Players> miPlayers = new ArrayList<Players>();
		//MI
		// Batters
		miPlayers.add(new Players("Rohit Sharma", 45, "Indian", "Batter", 2008, 257, 6628, 15));
		miPlayers.add(new Players("Dewald Brevis", 17, "South African", "Batter", 2022, 10, 230, 1));
		miPlayers.add(new Players("Suryakumar Yadav", 63, "Indian", "Batter", 2012, 150, 3594, 0));
		miPlayers.add(new Players("Ishan Kishan", 23, "Indian", "Wicketkeeper Batter", 2016, 105, 2644, 0));
		miPlayers.add(new Players("N. Tilak Varma", 9, "Indian", "Batter", 2022, 38, 1156, 0));
		miPlayers.add(new Players("Tim David", 20, "Singaporean", "Batter", 2021, 38, 659, 0));

		// All Rounder
		miPlayers.add(new Players("Hardik Pandya", 33, "Indian", "All Rounder", 2015, 137, 2525, 64));
		miPlayers.add(new Players("Mohammad Nabi", 7, "Afghan", "All Rounder", 2017, 24, 215, 15));
		miPlayers.add(new Players("Romario Shepherd", 52, "West Indian", "All Rounder", 2022, 10, 115, 4));
		miPlayers.add(new Players("Shams Mulani", 11, "Indian", "All Rounder", 2024, 2, 1, 0));
		miPlayers.add(new Players("Nehal Wadhera", 18, "Indian", "All Rounder", 2023, 20, 350, 0));

		// Bowlers
		miPlayers.add(new Players("Kwena Maphaka", 91, "South African", "Bowler", 2024, 2, 0, 1));
		miPlayers.add(new Players("Jasprit Bumrah", 93, "Indian", "Bowler", 2013, 133, 69, 165));
		miPlayers.add(new Players("Piyush Chawla", 3, "Indian", "Bowler", 2008, 192, 624, 192));
		miPlayers.add(new Players("Akash Madhwal", 14, "Indian", "Bowler", 2023, 13, 4, 19));
		miPlayers.add(new Players("Luke Wood", 32, "English", "Bowler", 2024, 2, 9, 1));
		miPlayers.add(new Players("Shreyas Gopal", 4, "Indian", "Bowler", 2023, 52, 180, 52));
		miPlayers.add(new Players("Nuwan Thushara", 99, "Sri Lankan", "Bowler", 2023, 7, 0, 8));

		allTeams.put("MI", miPlayers);
		
		//CSK
		List<Players> cskPlayers = new ArrayList<Players>();
		// Batters
		cskPlayers.add(new Players("Ruturaj Gaikwad", 31, "Indian", "Batter", 2020, 66, 2380, 0));
		cskPlayers.add(new Players("Devon Conway", 88, "South African", "Batter", 2022, 23, 924, 0));
		cskPlayers.add(new Players("MS Dhoni", 7, "Indian", "Wicketkeeper Batter", 2008, 264, 5243, 0));
		cskPlayers.add(new Players("Ajinkya Rahane", 27, "Indian", "Batter", 2008, 185, 4642, 1));
		cskPlayers.add(new Players("Sameer Rizvi", 52, "Indian", "Batter", 2024, 8, 51, 0));

		// All Rounder
		cskPlayers.add(new Players("Ravindra Jadeja", 12, "Indian", "All Rounder", 2008, 240, 2959, 160));
		cskPlayers.add(new Players("Mitchell Santner", 74, "New Zealander", "All Rounder", 2019, 18, 70, 15));
		cskPlayers.add(new Players("Moeen Ali", 18, "English", "All Rounder", 2018, 67, 1162, 35));
		cskPlayers.add(new Players("Shivam Dube", 25, "Indian", "All Rounder", 2019, 65, 1502, 5));
		cskPlayers.add(new Players("Rachin Ravindra", 26, "New Zealander", "All Rounder", 2024, 10, 222, 0));
		cskPlayers.add(new Players("Shardul Thakur", 54, "Indian", "All Rounder", 2015, 95, 307, 94));

		// Bowlers
		cskPlayers.add(new Players("Deepak Chahar", 90, "Indian", "Bowler", 2016, 81, 80, 77));
		cskPlayers.add(new Players("Maheesh Theekshana", 58, "Sri Lankan", "Bowler", 2022, 27, 7, 25));
		cskPlayers.add(new Players("Mustafizur Rahman", 21, "Bangladeshi", "Bowler", 2016, 57, 13, 61));
		cskPlayers.add(new Players("Tushar Deshpande", 96, "Indian", "Bowler", 2020, 36, 21, 42));
		cskPlayers.add(new Players("Matheesha Pathirana", 99, "Sri Lankan", "Bowler", 2022, 20, 0, 34));

		allTeams.put("CSK", cskPlayers);

		// RCB
		List<Players> rcbPlayers = new ArrayList<Players>();
		// Batters
		rcbPlayers.add(new Players("Faf du Plessis", 18, "South African", "Batter", 2012, 145, 4571, 0));
		rcbPlayers.add(new Players("Rajat Patidar", 21, "Indian", "Batter", 2021, 27, 799, 0));
		rcbPlayers.add(new Players("Virat Kohli", 18, "Indian", "Batter", 2008, 252, 8004, 4));
		rcbPlayers.add(new Players("Anuj Rawat", 66, "Indian", "Wicketkeeper Batter", 2021, 24, 318, 0));
		rcbPlayers.add(new Players("Dinesh Karthik", 19, "Indian", "Wicketkeeper Batter", 2008, 257, 4842, 0));
		rcbPlayers.add(new Players("Will Jacks", 24, "English", "Batter", 2023, 8, 230, 2));

		// All Rounder
		rcbPlayers.add(new Players("Glenn Maxwell", 32, "Australian", "All Rounder", 2012, 134, 2771, 37));
		rcbPlayers.add(new Players("Karn Sharma", 33, "Indian", "All Rounder", 2013, 84, 350, 76));
		rcbPlayers.add(new Players("Cameron Green", 42, "Australian", "All Rounder", 2023, 29, 707, 16));
		rcbPlayers.add(new Players("Swapnil Singh", 8, "Indian", "All Rounder", 2023, 14, 39, 6));

		// Bowlers
		rcbPlayers.add(new Players("Akash Deep", 35, "Indian", "Bowler", 2022, 8, 19, 7));
		rcbPlayers.add(new Players("Alzarri Joseph", 12, "West Indian", "Bowler", 2019, 22, 27, 21));
		rcbPlayers.add(new Players("Lockie Ferguson", 69, "New Zealander", "Bowler", 2017, 45, 68, 46));
		rcbPlayers.add(new Players("Mohammed Siraj", 13, "Indian", "Bowler", 2017, 93, 109, 93));
		rcbPlayers.add(new Players("Yash Dayal", 28, "Indian", "Bowler", 2022, 28, 0, 28));
		rcbPlayers.add(new Players("Tom Curran", 59, "English", "Bowler", 2018, 13, 127, 13));
		rcbPlayers.add(new Players("Vyshak Vijay Kumar", 26, "Indian", "Bowler", 2023, 11, 14, 13));
		allTeams.put("RCB", rcbPlayers);
		
		//DC
		List<Players> dcPlayers = new ArrayList<Players>();
		dcPlayers.add(new Players("David Warner", 31, "Australia", "Batter", 2009, 156, 6176, 0));
		dcPlayers.add(new Players("Prithvi Shaw", 100, "India", "Batter", 2018, 61, 1587, 0));
		dcPlayers.add(new Players("Mitchell Marsh", 36, "Australia", "All Rounder", 2020, 38, 651, 8));
		dcPlayers.add(new Players("Axar Patel", 20, "India", "All Rounder", 2014, 86, 1075, 100));
		dcPlayers.add(new Players("Anrich Nortje", 22, "South Africa", "Bowler", 2020, 33, 43, 65));
		dcPlayers.add(new Players("Kuldeep Yadav", 23, "India", "Bowler", 2016, 50, 38, 45));
		dcPlayers.add(new Players("Rishabh Pant", 17, "India", "Wicketkeeper Batter", 2016, 92, 2460, 0));
		dcPlayers.add(new Players("Harry Brook", 88, "England", "Batter", 2023, 21, 45, 0));
		dcPlayers.add(new Players("Yash Dhull", 22, "India", "Batter", 2022, 18, 220, 0));
		dcPlayers.add(new Players("Lungi Ngidi", 30, "South Africa", "Bowler", 2018, 16, 25, 29));
		dcPlayers.add(new Players("Ishant Sharma", 29, "India", "Bowler", 2008, 101, 123, 306));
		dcPlayers.add(new Players("Pravin Dubey", 23, "India", "Bowler", 2020, 19, 14, 13));
        
        allTeams.put("DC", dcPlayers);
        
        //GT
        List<Players> gtPlayers = new ArrayList<Players>();
        gtPlayers.add(new Players("Hardik Pandya", 33, "India", "All Rounder", 2016, 84, 2001, 45));
        gtPlayers.add(new Players("Shubman Gill", 7, "India", "Batter", 2019, 44, 1380, 0));
        gtPlayers.add(new Players("Rashid Khan", 19, "Afghanistan", "Bowler", 2017, 50, 61, 99));
        gtPlayers.add(new Players("David Miller", 10, "South Africa", "Batter", 2012, 82, 2299, 0));
        gtPlayers.add(new Players("Mohammed Shami", 11, "India", "Bowler", 2013, 75, 117, 118));
        gtPlayers.add(new Players("Wriddhiman Saha", 21, "India", "Wicketkeeper Batter", 2008, 70, 2074, 0));
        gtPlayers.add(new Players("Kane Williamson", 22, "New Zealand", "Batter", 2015, 58, 1740, 0));
        gtPlayers.add(new Players("Vijay Shankar", 26, "India", "All Rounder", 2019, 39, 883, 38));
        gtPlayers.add(new Players("Matthew Wade", 13, "Australia", "Wicketkeeper Batter", 2019, 25, 478, 0));
        gtPlayers.add(new Players("Rahul Tewatia", 14, "India", "All Rounder", 2020, 29, 467, 22));
        gtPlayers.add(new Players("Darshan Nalkande", 24, "India", "Bowler", 2020, 22, 21, 23));
        gtPlayers.add(new Players("Jayant Yadav", 22, "India", "Bowler", 2016, 36, 30, 43));

        
        allTeams.put("GT", gtPlayers);
        
        //KKR
        List<Players> kkrPlayers = new ArrayList<Players>();
        kkrPlayers.add(new Players("Shreyas Iyer", 33, "India", "Batter", 2017, 93, 2361, 0));
        kkrPlayers.add(new Players("Andre Russell", 12, "West Indies", "All Rounder", 2012, 91, 1959, 89));
        kkrPlayers.add(new Players("Nitish Rana", 28, "India", "Batter", 2016, 81, 1935, 0));
        kkrPlayers.add(new Players("Sunil Narine", 45, "West Indies", "All Rounder", 2012, 110, 1226, 127));
        kkrPlayers.add(new Players("Rinku Singh", 24, "India", "Wicketkeeper Batter", 2018, 35, 811, 0));
        kkrPlayers.add(new Players("Venkatesh Iyer", 26, "India", "All Rounder", 2021, 27, 1032, 0));
        kkrPlayers.add(new Players("Rahmanullah Gurbaz", 29, "Afghanistan", "Wicketkeeper Batter", 2023, 10, 226, 0));
        kkrPlayers.add(new Players("Shreyas Gopal", 40, "India", "Bowler", 2019, 56, 37, 45));
        kkrPlayers.add(new Players("Varun Chakravarthy", 20, "India", "Bowler", 2018, 47, 57, 70));
        kkrPlayers.add(new Players("Pat Cummins", 29, "Australia", "Bowler", 2017, 50, 64, 108));
        kkrPlayers.add(new Players("Jason Roy", 31, "England", "Batter", 2015, 56, 1490, 0));
        kkrPlayers.add(new Players("Anukul Roy", 80, "India", "Bowler", 2019, 20, 18, 24));

        
        allTeams.put("KKR", kkrPlayers);
        
        //LSG
        List<Players> lsgPlayers = new ArrayList<Players>();
        lsgPlayers.add(new Players("KL Rahul", 1, "India", "Batter", 2013, 105, 3935, 0));
        lsgPlayers.add(new Players("Quinton de Kock", 6, "South Africa", "Wicketkeeper Batter", 2013, 100, 2896, 0));
        lsgPlayers.add(new Players("Nicholas Pooran", 7, "West Indies", "Wicketkeeper Batter", 2019, 43, 1056, 0));
        lsgPlayers.add(new Players("Deepak Hooda", 8, "India", "All Rounder", 2016, 53, 1295, 38));
        lsgPlayers.add(new Players("Krunal Pandya", 23, "India", "All Rounder", 2016, 69, 1375, 51));
        lsgPlayers.add(new Players("Marcus Stoinis", 28, "Australia", "All Rounder", 2016, 49, 1071, 35));
        lsgPlayers.add(new Players("Ayush Badoni", 12, "India", "Batter", 2022, 19, 395, 0));
        lsgPlayers.add(new Players("Shivam Mavi", 17, "India", "Bowler", 2020, 26, 30, 34));
        lsgPlayers.add(new Players("Mohsin Khan", 34, "India", "Bowler", 2022, 29, 29, 25));
        lsgPlayers.add(new Players("Amit Mishra", 19, "India", "Bowler", 2008, 150, 166, 134));
        lsgPlayers.add(new Players("Ravi Bishnoi", 32, "India", "Bowler", 2020, 32, 46, 40));
        lsgPlayers.add(new Players("Naveen-ul-Haq", 23, "Afghanistan", "Bowler", 2020, 19, 28, 24));



        allTeams.put("LSG", lsgPlayers);
        
        //PBKS
        List<Players> pbksPlayers = new ArrayList<Players>();
        pbksPlayers.add(new Players("Shikhar Dhawan", 42, "India", "Batter", 2008, 197, 6347, 0));
        pbksPlayers.add(new Players("Jonny Bairstow", 7, "England", "Wicketkeeper Batter", 2019, 22, 652, 0));
        pbksPlayers.add(new Players("Liam Livingstone", 36, "England", "All Rounder", 2020, 31, 835, 21));
        pbksPlayers.add(new Players("Jitesh Sharma", 30, "India", "Wicketkeeper Batter", 2020, 26, 473, 0));
        pbksPlayers.add(new Players("Sam Curran", 18, "England", "All Rounder", 2019, 49, 688, 30));
        pbksPlayers.add(new Players("Arshdeep Singh", 24, "India", "Bowler", 2020, 36, 46, 42));
        pbksPlayers.add(new Players("Rahul Chahar", 29, "India", "Bowler", 2020, 31, 32, 63));
        pbksPlayers.add(new Players("Shahrukh Khan", 25, "India", "All Rounder", 2021, 29, 150, 0));
        pbksPlayers.add(new Players("Mohammed Shami", 5, "India", "Bowler", 2013, 75, 117, 118));
        pbksPlayers.add(new Players("Bhanuka Rajapaksa", 31, "Sri Lanka", "Batter", 2022, 19, 510, 0));
        pbksPlayers.add(new Players("Matthew Short", 45, "Australia", "All Rounder", 2023, 15, 305, 0));
        pbksPlayers.add(new Players("Harpreet Brar", 12, "India", "Bowler", 2020, 29, 29, 34));


        
        allTeams.put("PBKS", pbksPlayers);
        
        //SRH
        List<Players> srhPlayers = new ArrayList<Players>();
        srhPlayers.add(new Players("Aiden Markram", 18, "South Africa", "Batter", 2017, 50, 1582, 0));
        srhPlayers.add(new Players("Bhuvneshwar Kumar", 15, "India", "Bowler", 2013, 117, 166, 125));
        srhPlayers.add(new Players("Harry Brook", 51, "England", "Batter", 2023, 21, 45, 0));
        srhPlayers.add(new Players("Umran Malik", 24, "India", "Bowler", 2021, 29, 34, 40));
        srhPlayers.add(new Players("Rahul Tripathi", 21, "India", "Batter", 2017, 56, 1492, 0));
        srhPlayers.add(new Players("Glenn Phillips", 18, "New Zealand", "Wicketkeeper Batter", 2022, 20, 369, 0));
        srhPlayers.add(new Players("Washington Sundar", 21, "India", "All Rounder", 2017, 50, 650, 39));
        srhPlayers.add(new Players("Mayank Agarwal", 22, "India", "Batter", 2011, 111, 2558, 0));
        srhPlayers.add(new Players("T Natarajan", 7, "India", "Bowler", 2020, 36, 51, 61));
        srhPlayers.add(new Players("Akhil Hossain", 28, "Bangladesh", "Bowler", 2022, 12, 17, 18));
        srhPlayers.add(new Players("Abhishek Sharma", 41, "India", "All Rounder", 2019, 39, 1034, 0));
        srhPlayers.add(new Players("Prithvi Shaw", 25, "India", "Batter", 2018, 61, 1587, 0));

        
        allTeams.put("SRH", srhPlayers);
        
        //RR
        List<Players> rrPlayers = new ArrayList<Players>();
        rrPlayers.add(new Players("Sanju Samson", 7, "India", "Wicketkeeper Batter", 2013, 100, 3258, 0));
        rrPlayers.add(new Players("Jos Buttler", 55, "England", "Wicketkeeper Batter", 2016, 62, 2700, 0));
        rrPlayers.add(new Players("Yashasvi Jaiswal", 42, "India", "Batter", 2020, 36, 1051, 0));
        rrPlayers.add(new Players("Devdutt Padikkal", 28, "India", "Batter", 2021, 30, 900, 0));
        rrPlayers.add(new Players("Shimron Hetmyer", 21, "West Indies", "Batter", 2020, 31, 712, 0));
        rrPlayers.add(new Players("Ravichandran Ashwin", 33, "India", "All Rounder", 2008, 172, 1468, 148));
        rrPlayers.add(new Players("Trent Boult", 18, "New Zealand", "Bowler", 2018, 58, 0, 75));
        rrPlayers.add(new Players("Prasidh Krishna", 29, "India", "Bowler", 2020, 36, 0, 43));
        rrPlayers.add(new Players("Yuzvendra Chahal", 3, "India", "Bowler", 2018, 57, 0, 83));
        rrPlayers.add(new Players("Jason Holder", 55, "West Indies", "All Rounder", 2013, 43, 1388, 150));
        rrPlayers.add(new Players("Kartik Tyagi", 29, "India", "Bowler", 2020, 24, 0, 27));
        rrPlayers.add(new Players("Rassie van der Dussen", 36, "South Africa", "Batter", 2022, 16, 457, 0));

        
        allTeams.put("RR", rrPlayers);
        
		return allTeams;
	}

}
