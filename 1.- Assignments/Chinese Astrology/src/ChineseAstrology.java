import java.util.Scanner;

public class ChineseAstrology {
	
		
	
    
    
    
   
 
    
 
    public static void Goat() {
    	
    	System.out.println("Your Chinese zodiac sign is a Goat");
    	System.out.println("The Goat is eighth in the Chinese zodiac cycle.");
    	System.out.println("People born in a year of the Goat are generally believed to be gentle, mild-mannered, shy, stable, sympathetic, amicable, and brimming with a strong sense of kindheartedness and justice.");
    	
        }
    
	public static void display(String animal, String message) {
		
		System.out.println("Your Chinese zodiac sign is a " + animal);
		System.out.println(message);
		
	}

       public static void main(String []args) {
		
		Scanner scan = new Scanner(System.in);
		String animalS = "", message = "";
		
		System.out.println("What is your year or birth?");
		int year = scan.nextInt();
		
		int animal = year % 12;
		
		switch(animal) {
		
		case 0:
			animalS = "Monkey";
			message = "The Monkey is the ninth of 12 animals in the recurring 12-year Chinese zodiac cycle.\r\n" + 
					"People born in a year of the Monkey have magnetic personalities and are witty and intelligent. Personality traits like mischievousness, curiosity, and cleverness make them very naughty.";
		    break; 
		    
		case 1:
			animalS = "Rooster";
			message = "The Rooster is 10th among the 12 animals in the Chinese zodiac cycle. Every 12 years is a Rooster year, beginning at Chinese New Year.\r\n" + 
					"People born in a year of the Rooster are very observant. Hardworking, resourceful, courageous, and talented, Roosters are very confident in themselves.";
		    break;
		    
		case 2:
			animalS = "Pig";
			message = "The Dog occupies the 11th position in the Chinese zodiac after the Rooster and before the Pig.\r\n" +
					"Dogs are loyal and honest, amiable and kind, cautious and prudent. Due to having a strong sense of loyalty and sincerity, Dogs will do everything for the person who they think is most important.";
		    break;
		    
		case 3:
			animalS = "Pig";
			message = "The Pig is the 12th of 12 animals in the recurring 12-year Chinese zodiac cycle.\r\n" + 
					"Pigs are diligent, compassionate, and generous. They have great concentration: once they set a goal, they will devote all their energy to achieving it.";			
			break;
			
		case 4:
			animalS = "Rat";
			message = "The Year of the Rat is the first zodiac sign in the Chinese zodiac cycle.\r\n" + 
					"With strong intuition and quick responses, Rats always easily adapt themselves to a new environment.";		
			break;
			
		case 5:
			animalS = "Ox";
			message = "The Ox occupies the second position in the Chinese Zodiac.\r\n" + 
					"Oxes are known for diligence, dependability, strength and determination. Having an honest nature, Oxes are strongly patriotic, have ideals and ambitions for life, and attach importance to family and work.";		
			break;
			
		case 6:
			animalS = "Tiger";
			message = "The Tiger ranks third among the animals in the Chinese zodiac.\r\n" + 
					"People born in a year of the Tiger are brave, competitive, unpredictable, and confident. They are very charming and well-liked by others. But sometimes they are likely to be impetuous, irritable, and overindulged.";		
			break;
			
		case 7:
			animalS = "Rabbit";
			message = "The Year of the Rabbit is fourth in the Chinese zodiac cycle.\r\n" + 
					"Rabbits tend to be gentle, quiet, elegant, and alert as well as quick, skillful, kind, patient, and very responsible. However, they might be superficial, stubborn, melancholy, and overly-discreet.";		
			break;
			
		case 8:
			animalS = "Dragon";
			message = "The Dragon is the fifth of the 12 Chinese zodiac animals.\r\n" + 
					"Among the Chinese zodiac animals, the dragon is the sole imaginary animal. The Chinese dragon is the most vital and powerful beast in the Chinese zodiac, although Dragons have an infamous reputation for being a hothead and possessing a sharp tongue.";		
			break;
			
		case 9:
			animalS = "Snake";
			message = "The Snake occupies the sixth position in the Chinese zodiac.\r\n" + 
					"In Chinese culture, the Snake is the most enigmatic animal among the 12 zodiac animals. People born in a year of the Snake are supposed to be the most intuitive.";		
			break;
			
		case 10:
			animalS = "Horse";
			message = "The Horse occupies the seventh position in the Chinese zodiac, after the Snake and before the Goat.\r\n" + 
					"People born in a year of the Horse are extremely animated, active and energetic. Horses love to be in a crowd, and they can usually be seen on such occasions as concerts, theater performances, meetings, sporting events, and parties.";		
			break;
			
		case 11:
			animalS = "Goat";
			message = "The Goat is eighth in the Chinese zodiac cycle.\r\n" + 
					"People born in a year of the Goat are generally believed to be gentle, mild-mannered, shy, stable, sympathetic, amicable, and brimming with a strong sense of kindheartedness and justice.";		
			break;
			
			
		}
		
		
		display(animalS, message);

		
		
		scan.close();
		
	}
	

	
	}

	
	