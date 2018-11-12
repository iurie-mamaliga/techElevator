package com.techelevator;

public class Exercises {

	public static void main(String[] args) {
        
        /*
        INSTRUCTIONS

        The primary purposes of these exercises are to practice: 
        		
        		1. declaring variables and using assignment statements
        		2. using variables, literals, and operators within arithmetic expressions
        		3. choosing meaningful variable names
        		4. choosing appropriate data types

        One of the hardest things about programming is choosing good names. Spend time
        to find good, meaningful, and descriptive names for your variables. Clarity and
        expressiveness is more important than brevity. Err on the side of longer, more 
        descriptive names over short, cryptic ones.

        Be consistent with your choice of datatypes, especially when it comes to 
        some values like money. There are many different ways to express money. Pick one, 
        and stick with it throughout these exercises.
        
        Keep your code consistent and well formatted. When code is poorly indented, 
        or lost in a flood of blank lines, it can make it difficult to read. 
        */

        /* 
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch? 
        */
		
		// ### EXAMPLE:  
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

        /* 
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests? 
        */
		
		// ### EXAMPLE: 
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* 
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods? 
        */

		int numberOfRaccoonsPlaying = 3;
		int numberOfRaccoonsWentHome = 2;
		System.out.println("3. Number of raccoons left playing is: " + (numberOfRaccoonsPlaying - numberOfRaccoonsWentHome));
		
        /* 
        4. There are 5 flowers and 3 bees. How many less bees than flowers? 
        */

		int numberOfFlowers = 5;
		int numberOfBees = 3;
		System.out.println("4. There are " + (numberOfFlowers - numberOfBees) + " less bees than flowers.");
		
        /* 
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now? 
        */

		int lonelyPigeon = 1;
		int newPigeon = 1;
		System.out.println("5. There are " + (lonelyPigeon + newPigeon) + " pigeons eating");
		
        /* 
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now? 
        */

		short owlsSittingOnFence = 3;
		short joinedOwls = 2;
		System.out.println("6. There are " + (owlsSittingOnFence + joinedOwls) + " owls sitting on the fence.");
		
		
        /* 
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home? 
        */

		short workingBeavers = 2;
		short swimmingBeavers = 1;
		System.out.println("7. The number of beavers still working on their home is: " + (workingBeavers - swimmingBeavers));
		
        /* 
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all? 
        */

		short toucansSittingOnTreeIntialy = 2;
		short toucansJoinedLater = 1;
		System.out.println("8. Final number of toucans on branch is: " + (toucansSittingOnTreeIntialy + toucansJoinedLater));
		
        /* 
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts? 
        */

		short numberOfSquirrels = 4;
		short numberOfNuts = 2;
		System.out.println("9. There are " + (numberOfSquirrels - numberOfNuts) + " more squirrels than nuts.");
		
        /* 
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find? 
        */
		
		int quarterCoin = 25;
		int dimeCoin = 10;
		int nickel = 5;
		System.out.println("10. Mrs. Hilt found " + (quarterCoin + dimeCoin + nickel) + " cents.");

        /* 
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all? 
        */

		int briefsClass = 18;
		int macAdamsClass = 20;
		int flanneryClass = 17;
		System.out.println("11. First grade baked " + (briefsClass + macAdamsClass + flanneryClass) + " muffinns.");
	
		/*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
        
		double vovoPrice = 0.24;
		double whistlePrice = 0.14;
		System.out.printf("12. Mrs. Hilt spend a total of $%.2f.%n", (vovoPrice + whistlePrice));

        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
        
		int numberOfLargeMarshmallows = 8;
		int numberOfMiniMarshmallows = 10;
		System.out.println("13. Mrs. Hilt used " + (numberOfLargeMarshmallows + numberOfMiniMarshmallows) + " marshmallows.");
		
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
        
		short inchesOfSnowHiltHouse = 29;
		short inchesOfSnowElementarySchool = 17;
		System.out.println("14. Mrs. Hilt's received " + (inchesOfSnowHiltHouse - inchesOfSnowElementarySchool) + 
							" more inches than Elementary School.");
		
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
        
		double totalAmountHilt = 10.0;
		double priceForToyTruck = 3.0;
		double priceForPencil = 2.0;
		System.out.printf("15. Mrs. Hilt has $%.2f.%n", (totalAmountHilt - (priceForToyTruck + priceForPencil)));
		
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
        
		short numberOfMarblesJoshHas = (short) 16;
		short numberOfMarblesJoshLost = (short) 7;
		System.out.println("16. Josh has " + (numberOfMarblesJoshHas - numberOfMarblesJoshLost) + " marbles left.");
		
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
        
		short numberMarblesMeganHas = (short) 19;
		short numberMarblesMeganWants = (short) 25;
		System.out.println("17. Megan has " +numberMarblesMeganHas + " marbles, she needs " + (numberMarblesMeganWants - numberMarblesMeganHas) + 
				" more marbles to have " + numberMarblesMeganWants + ".");
		
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
        
		short ballonsBradHas = (short) 17;
		short redBallons = (short) 8;
		System.out.println("18. Brad has " + (ballonsBradHas - redBallons) + " greed ballons.");
		
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		
		short booksOnTheShelf = (short) 38;
		short martaBooks = (short) 10;
		System.out.println("19. There are " + (booksOnTheShelf + martaBooks) + " books on the shelf.");
        
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
        
		short legsOnBee = (short) 6;
		short numberOfBee = (short) 8;
		System.out.println("20. " + numberOfBee + " bees have " + (legsOnBee * numberOfBee) + " legs.");
		
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
        
		double priceForCone = 0.99;
		short numberOfCones = (short) 2;
		System.out.printf("21. " + numberOfCones + " cones of ice cream cost $%.2f.%n", (priceForCone * numberOfCones));
		
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
        
		short rocksHiltHas = (short) 64;
		short rocksHiltNeeds = (short) 125;
		System.out.println("22. Mrs. Hilt has " + rocksHiltHas + " rocks and needs " + (rocksHiltNeeds - rocksHiltHas) + " more." );
		
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		
		short marblesHiltHad = (short) 38;
		short marblesHiltLost = (short) 15;
		System.out.println("23. Mrs. Hilt lost " + (marblesHiltHad - marblesHiltLost) + " marbles.");
        
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
        
		int milesHiltDrove = 32;
		int totalMiles = 78;
		System.out.println("24. Mrs. Hilt has " + (totalMiles - milesHiltDrove) + " left to drive.");
		
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		
		int timeSpentMorning = 90;
		int timeSpentAfternoon = 45;
		int totalTimeSpent = 0;
		int totalHoursSpent = 0;
		int totalMinutesSpent = 0;
		
		totalHoursSpent = (timeSpentMorning + timeSpentAfternoon) / 60;
		totalMinutesSpent = ((timeSpentMorning + timeSpentAfternoon) % 60);
		System.out.println("25. Mrs. Hilt spent " + totalHoursSpent + " hours and " + totalMinutesSpent + " shoveling snow minutes." );
        
        /*    
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
        
		short numberOfHotDogs = 6;
		double pricePerHotDog = 0.5;
		System.out.printf("26. Mrs. Hils paid $%.2f.%n", (numberOfHotDogs * pricePerHotDog));
		
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		
		int moneyHiltHas = 50;
		final int PENCIL_PRICE = 7;	
		System.out.println("27. Mrs. Hilt can buy " + (moneyHiltHas / PENCIL_PRICE) + " pencils.");
        
        /*    
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		
		int orangeButterflies = 20;
		int totalButterflies = 33;
		System.out.println("28. There are " + (totalButterflies - orangeButterflies) + " red butterflies.");
        
        /*    
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
        
		double moneyKateHas = 1.0;
		double candyPrice = 0.54;
		System.out.printf("29. Kate should get back $%.2f.%n", (moneyKateHas - candyPrice));
		
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		
		int treesInBackyard = 13;
		int treesToBePlanted = 12;
		System.out.println("30. Mark will have " + (treesInBackyard + treesToBePlanted) + " trees.");
        
        /*    
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		
		final int HOURS_IN_DAY  = 24;
		int numberOfDays = 2;
		System.out.println("31. Joy will see her grandma in " + (HOURS_IN_DAY * numberOfDays) + " hours.");
        
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
        
		int numberOfKimCousins = 4;
		int numberOfGums = 5;
		System.out.println("32. Kim needs " + (numberOfKimCousins * numberOfGums) + " pieces of gum.");
		
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		
		double moneyDanHas = 3.0;
		double priceForCandy = 1.0;
		System.out.printf("33. Dan has $%.2f.%n", (moneyDanHas - priceForCandy));
        
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
        
		int boatsInLake = 5;
		int peopleOnBoat = 3;
		System.out.println("34. There are " + (boatsInLake * peopleOnBoat) + " total people on the lake.");
		
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
        
		int totalLegos = 380;
		int lostLegos = 57;
		System.out.println("35. Ellen has " + (totalLegos - lostLegos) + " legos left.");
		
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        
		int alreadyBakedMuffins = 35;
		int neededMuffins = 83;
		System.out.println("36. Arthur needs to bake " + (neededMuffins - alreadyBakedMuffins) + " more muffins.");
		
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
        
		int willyCrayons = 1400;
		int lucyCrayons = 290;
		System.out.println("37. Willy has " + (willyCrayons - lucyCrayons) + " more crayons than Lucy.");
		
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
        
		int stickersOnPage = 10;
		int numberOfPages = 22;
		System.out.println("38. There are total of " + (stickersOnPage * numberOfPages) + " stickers.");
		
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
        
		int numberOfCupcakes = 96;
		int numberOfChildren = 8;
		System.out.println("39. Each child will get " + (numberOfCupcakes / numberOfChildren) + " cupcakes.");
		
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
        
		int numberOfGingerbreads = 47;
		int numberOfGingerbreadsInEachJar = 6;
		System.out.println("40. Number of cookies left outside jars is " + (numberOfGingerbreads % numberOfGingerbreadsInEachJar));
		
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
        
		int numberOfCroissants = 59;
		int numberOfNeighbor = 8;
		System.out.println("41. There will be " + (numberOfCroissants % numberOfNeighbor) + " croissants left."); 
		
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
        
		int numberOfCookies = 276;
		int cookiesPerTray = 12;
		System.out.println("42. She will need " + (numberOfCookies / cookiesPerTray) + " trays.");
		
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
        
		int nuberOfPretzels = 480;
		int servingSize = 12;
		System.out.println("43. Marian prepared " + (nuberOfPretzels / servingSize) + " servings.");
		
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
        
		int lemonCupcakes = 53;
		int lemonCupcakesLeftArHome = 2;
		int cupcakesPerBox = 3;
		System.out.println("44. " + ((lemonCupcakes - lemonCupcakesLeftArHome) / cupcakesPerBox) + " boxes were given away.");
		
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
        
		int corrotSticks = 74;
		int numberOfPeople = 12;
		System.out.println("45. " + (corrotSticks % numberOfPeople) + " carrot sticks were left.");
		
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		
		int teddyBears = 98;
		int bearsPerShelf = 7;
		System.out.println("46. " +(teddyBears / bearsPerShelf) + " shelfs will be filled.");
        
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		
		int picturesPerAlbum = 20;
		int totalPictures = 480;
		System.out.println("47. " + (totalPictures / picturesPerAlbum) + " albums are needed.");
        
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
        
		int tradingCards = 94;
		int cardsPerBox = 8;
		System.out.println("48. There were " + (tradingCards / cardsPerBox) + " filled boxes, the unfilled box has " +
						(tradingCards % cardsPerBox) +" cards.");
		
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */

		int numberOfBooks = 210;
		int numberOfShelves = 10;
		System.out.println("49. Each shelve will contain " + (numberOfBooks / numberOfShelves) + " books.");
		
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */

		int numberOfCroissantsCristinaBaked = 17;
		int numberOfGuests = 7;
		System.out.println("50. Each guest will get " + (numberOfCroissantsCristinaBaked / numberOfGuests) + " croissants.");
		
        /*
            CHALLENGE PROBLEMS
        */
        
        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages 
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */

		final int WORKING_HOURS_PER_DAY = 8;
		
		double billTimePerRoom = 2.15;
		double jillTimePerRoom = 1.9;
		int numberOfRoomsFirstChallenge = 5;
		int numberOfRoomsSecondChallenge = 623;
		int feetPerRoom = (12 * 14);	
		double billHourlyRate = feetPerRoom / billTimePerRoom; 
		double jillHourlyRate = feetPerRoom / jillTimePerRoom;
		double combinedHourlyRate = billHourlyRate + jillHourlyRate;
		double totalTimeInHours = (feetPerRoom * numberOfRoomsFirstChallenge) / combinedHourlyRate;
		double totalTimeInDays = ((feetPerRoom * numberOfRoomsSecondChallenge) / combinedHourlyRate) / (WORKING_HOURS_PER_DAY);
		
		System.out.printf("\n\nTotal time in hours it will take Bill and Jill to paint " + numberOfRoomsFirstChallenge + " rooms the will be %.2f.%n", (totalTimeInHours));
		System.out.printf("\n\nTotal time it in days it will take Bill and Jill to paint " + numberOfRoomsSecondChallenge + " rooms will be %.2f.%n", (totalTimeInDays));
		
		
        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B." 
        */

		String firstName = "Iurie", lastName = "Mamaliga", middleInitial = "A";
		String fullName = firstName + ", " + lastName + " " + middleInitial + ".";
		System.out.println("\n\nMy full name is " + fullName);
		
		
        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles. 
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */
		
		int totalDistance = 800;
		int distanceTraveled = 537;
		System.out.println("\n\nThe train traveled " + ((distanceTraveled * 100) / totalDistance) + " %.");

	}

}
