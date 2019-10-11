package MotherAssess;

import java.util.Random;
import java.util.Scanner;

public class TheInfiniteTerrainSystem {

	private String name;
	private String homeland;
	private int age;
	private int finishPointNS;
	private int finishingPointEW;
	private int PlayerLocationNS;
	private int PlayerLocationEW;
	private String finale;
	private Scanner scanner = new Scanner(System.in);

	public int getFinishingPointEW() {
		return finishingPointEW;
	}

	public void setFinishingPointEW(int finishingPointEW) {
		this.finishingPointEW = finishingPointEW;
	}

	public int getPlayerLocationEW() {
		return PlayerLocationEW;
	}

	public void setPlayerLocationEW(int playerLocationEW) {
		PlayerLocationEW = playerLocationEW;
	}

	private String movement;

	public int getFinishPointNS() {
		return finishPointNS;
	}

	public void setFinishPointNS(int finishPointNS) {
		this.finishPointNS = finishPointNS;
	}

	public int getPlayerLocationNS() {
		return PlayerLocationNS;
	}

	public void setPlayerLocationNS(int PlayerLocationNS) {
		this.PlayerLocationNS = PlayerLocationNS;
	}

	public void Begin() {
		System.out.println(
				"\nYour head hurts, dizzy, feeling sick, what happened? \nYou rub your eyes as you begin to adjust to your surroundings,"
						+ "you look to be in a clearing, in what seems to be a swamp. \nSurrounded by grey trees and marshy swampland, you have no idea how you got here."
						+ "As you start to come around more, you notice four pathways leading out of the clearing. \nAs you begin to pick yourself up and dust yourself off, a large crow "
						+ "soars down from above, perching on a brach that pertrudes from one of the grey oaks. \nIt is unlike any crow you''ve ever seen, much larger, much more sinister, jet black in colour,"
						+ "the crow seems to be examining you, and then it opens its beak. \n''Hello there'' it begins, it speaks with a slow, calm, but menacing voice, ''I see you''ve stumbled into the swamplands, I do wonder your purpose here.''"
						+ "it continues, ''''Before you set off into the depths of the swamp, I must ask you a few questions.''''");

		System.out.println("\n''Tell me, what is your name?''");
		name = scanner.nextLine();
		System.out.println("''Well then, welcome to my swamp " + name + ", I hope you find it, homely friend.''");

		System.out.println("''Where do you come from?''");
		homeland = scanner.nextLine();
		System.out.println("''Aha the great " + homeland
				+ ", I have heard many tales of this great place, I wonder if you'll live up to expectation.''");

		System.out.println("''Now my final question, how old are you " + name + "?''");
		age = Integer.parseInt(scanner.nextLine());

		if (age < 18) {
			System.out.println(
					"''Aha, a young traveller, well I do hope the swamplands treat you kindly, there are some dark and dangerous things out there you know, I would proceed with the upmost caution.''");
		} else if (age >= 18 && age < 40) {
			System.out.println(
					"''I see, a young adventurer looking to prove their might ey? Thinking you can conqour the swamplands is that it, well well, we will see how you fare out there.''");
		} else {
			System.out.println(
					"''An old soul, come to make your final peace with the swamplands no? Lets see if those who lurk here will accept your peace.''");
		}
		System.out.println(
				"\n''Seen as you have entertained my questions, here is a little gift from me to you, there that rock behind you.''"
						+ " The crow gestures with its monstrously large wing to a rock just over your left shoudler, \n''That there rock contains a special item, a compass of sorts.'' "
						+ "\nYou lift the rock to find a small rusty metallic object laying on the ground, you pick it up to examine it closer."
						+ "\n''Now this is not just any compass" + name
						+ ", this compass will lead you out of the swamp if you so desire, to the greatest treasure of your dreams. It will along the way also point you towards the, ahem,'' The crow chuckles with the next word, '' interesting features that lay in wait in the swampland''"
						+ "\nYou wodner what this devilish bird means, is he a friend? A foe? Will this compass truly lead you to safety? Or is it just a ploy, so you lose yourself to the swampland forever?"
						+ "\n''I see the concern on your face " + name
						+ ", you need not worry, I am simply a guide to you and those alike, who find themselves lost, scared, no knowledge of how they got here.''"
						+ "\n''Well trust me when I say this " + name
						+ ", all will be revealed soon enough.'' \nAnd with that, the crow opened his gigantic wings, and with a swift flap, was away, lost as it blended with the grey sky."
						+ "\nWhat are you to do, you wonder, I guess you only have one option, to consult the compass.");

	}

	public void Journey() {

		Random finishNS = new Random();
		setFinishPointNS(finishNS.nextInt(10));
		Random finishEW = new Random();
		setFinishingPointEW(finishEW.nextInt(10));
		// finishPoint = getFinishPoint() + 20;
		// System.out.println("Finish point = " + getFinishPoint());
		Random startNS = new Random();
		setPlayerLocationNS(startNS.nextInt(10));
		Random startEW = new Random();
		setPlayerLocationEW(startEW.nextInt(10));

		System.out.println(
				"Looking down at the compass you see the needle flickling back and forth, you remeber what the crow said,"
						+ "\n\n'This compass will lead you out of the swamp if you so desire, to the greatest treasure of your dreams. It will point towards the interesting features of the swampland'"
						+ "\n\nYou question what lies ahead, as the compass suggests there are many points of interets around this clearing."
						+ "\nAs the compass needle won't settle right now, you decide you have only one option, to make a choice of which path to take and start your journey blind, hopeful that the compass will kick in as you journey away from the clearing."
						+ "\nYou take a long at each path that lays in front of you, the western path looks overgrown, dense with overhanging branches and shrubbery, but still a managable pathway."
						+ "\nThe eastern path looks almost dired out, as though resembling a desert; it seems the sun beats down on it day and night and not a drop of rain ever falls on the eastern part of the swamp."
						+ "\nLooking towards the North, the path seems dark, almost plumeting into complete darkness, you can barley see past the first few rows of trees. You mannage to make out one faint structure in the distance, you can't quite tell what it is, but it seems to resemble some sort of tower."
						+ "\nThe south path looks the most inviting, the trees seem less grey than those on the other paths; the sun breaks through the trees more, lighting up the path more so than the others; you even see some flowers growing on one of the branches far along. Is this the way out, or just trick to lure you further into the depths of the swampland? ");

		while (PlayerLocationNS != getFinishPointNS() && PlayerLocationEW != getFinishingPointEW()) {

			System.out.println("\nWhich path should you take?(north/south/west/east)");
			movement = scanner.nextLine();

			switch (movement) {
			case "north":
				System.out.println("You have chosen to go North.");

				PlayerLocationNS++;
				break;
			case "south":
				System.out.println("You have chosen to go South");

				PlayerLocationNS--;
				break;
			case "east":
				System.out.println("You have chosen to go East");
				PlayerLocationEW--;
				break;
			case "west":
				System.out.println("You have chosen to go West");
				PlayerLocationEW++;
				break;
			}

			if (PlayerLocationNS > getFinishPointNS() & PlayerLocationEW > getFinishingPointEW()) {
				System.out.println(
						"\nThe compass glows as you hold it in your grasp. The needle shoots to south, then to the west, then to the south again. It continues fluctuating in this fashion."
								+ "\nAlmost suggesting your goal lies in a south-western direction. "
								+ "\nThe question is, do you follow the compass, or heed your own path?");

			} else if (PlayerLocationNS > getFinishPointNS() & PlayerLocationEW < getFinishingPointEW()) {
				System.out.println(
						"\nThe compass glows as you hold it in your grasp. The needle shoots to south, then to the east, then to the south again. It continues fluctuating in this fashion."
								+ "\nAlmost suggesting your goal lies in a south-eastern direction. "
								+ "\nThe question is, do you follow the compass, or heed your own path?");
			} else if (PlayerLocationNS > getFinishPointNS() & PlayerLocationEW == getFinishingPointEW()) {
				System.out.println(
						"\nThe compass glows as you hold it in your grasp. The needle shoots to south, and stays true to its direction."
								+ "\nIt seems the compass wants you to head directly south."
								+ "\nThe question is, do you follow the compass, or heed your own path?");
			} else if (PlayerLocationNS < getFinishPointNS() & PlayerLocationEW < getFinishingPointEW()) {
				System.out.println(
						"\nThe compass glows as you hold it in your grasp. The needle shoots to north, then to the east, then north again. It continues to fluctuate in this fashion. "
								+ "\nAlmost suggesting your gola lies in a north-eastern direction."
								+ "\nThe question is, do you follow the compass, or heed your own path?");
			} else if (PlayerLocationNS < getFinishPointNS() & PlayerLocationEW > getFinishingPointEW()) {
				System.out.println(
						"\nThe compass glows as you hold it in your grasp. The needle shoots to north, then to the west, then north again. It continues to fluctuate in this fashion. "
								+ "\nAlmost suggesting your gola lies in a north-western direction."
								+ "\nThe question is, do you follow the compass, or heed your own path?");
			} else if (PlayerLocationNS < getFinishPointNS() & PlayerLocationEW == getFinishingPointEW()) {
				System.out.println(
						"\nThe compass glows as you hold it in your grasp. The needle shoots to north, and stays true to its direction."
								+ "\nIt seems the compass wants you to head directly north."
								+ "\nThe question is, do you follow the compass, or heed your own path?");
			} else if (PlayerLocationNS == getFinishPointNS() & PlayerLocationEW < getFinishingPointEW()) {
				System.out.println(
						"\nThe compass glows as you hold it in your grasp. The needle shoots to east, then stays true to its direction."
								+ "\nIt seems the compass wants you to head directly east."
								+ "\nThe question is, do you follow the compass, or heed your own path?");
			} else if (PlayerLocationNS == getFinishPointNS() & PlayerLocationEW > getFinishingPointEW()) {
				System.out.println(
						"\nThe compass glows as you hold it in your grasp. The needle shoots to west, then stays true to its direction."
								+ "\nIt seems the compass wants you to head directly west."
								+ "\nThe question is, do you follow the compass, or heed your own path?");
			} else if (PlayerLocationNS == getFinishPointNS() & PlayerLocationEW == getFinishingPointEW()) {
				System.out.println(
						"\nYou have found your way out, you come to a clearing, what is it you see, you walk on for a closer look.");
				break;
			
			}

		}
	}

	public void finale() {
		System.out.println(
				"As you step forward into the clearing, the sun obscures your vision, you've been under grey skies for so long now it's difficult to adjust."
						+ "\n\nAfter a few moments, the blur in your vision reveals itself to be a church across the way, you walk towards it, slowly, ever cautious after your time spent amongst the swamplands."
						+ "\nAs you reach the door, the place a single hand on the handle. You can open the doors and eneter the church, where, if the corws promises are to be trusted, the greatest treasure of your dreams should be. But what if it was lying, what if it's a trap."
						+ "\nYou always have the option to turn and head back into the swamplands, to continue wandering through until you find a familiar place, something that triggers a memory?");
		System.out.println("\n\nDo you enter the church, or head back to the swampland?(church/swampland)");
		finale = scanner.nextLine();

		switch (finale) {
		case "church":
			System.out.println("\n\nYou burst in through the church doors, not knowing what to expect."
					+ "\nThere in front of you, is a decorated aisle, littered with rose petals and sparkly silver confetti."
					+ "\nIn all your confusion you don't notice the figuer racing towards you, you have no time to react, you don't even have time to raise your hands before,"
					+ "\nBAM" + "\nYou're knocked to the ground, is this it, is this the your final demise?"
					+ "\nAs your mind settles, you notice groups of people sat in pews all around, and as gaze down upon the figure that is now tightly wrapped around you, you recognise the being."
					+ "\nSuddenly all your memories come flooding back, the figure, your betrothed, cries. They are joyous tears of your safe return, as no one knew your whereabouts."
					+ "\n''Where have you been" + name + "?'' " + "\nYou're asked"
					+ "\n''My love, do I have a story to tell you.'' You respond.");
			break;
		case "swampland":
			System.out.println(
					"\n\nBroken, a tortured body and mind from your time amongst the swampland, you can't bring yoursself to open the door."
							+ "\nYou panic, what if something inside is listening, it can hear your breaths, it's coming to get you no matter what your decision."
							+ "\nYou make a mad dash back to the swampland, offering no satisfaction to the creature that lays in wait, you cackle as you run away, a mad laugh of warped victory, udner beleifs you've outsmarted the creature and will live to see another day."
							+ "\nYou head back in to the swampland, deep inside, never to return to the church again."
							+ "\nHave you saved yourself, or have you left behind your greatest treasure?"
							+ "\nMaybe one day you'll find out, but today, is not that day.");
			break;
		}
		System.out.println(
				"Thank you for playing, you have reached the end of the Swampland text adventure, I hope you enjoyed it, if you'd like to play again, just re-run the application.");
	}
}
