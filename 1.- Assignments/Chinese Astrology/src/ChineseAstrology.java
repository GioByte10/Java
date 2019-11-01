import java.util.Scanner;

public class ChineseAstrology {
	
public static void Monkey() {
		
		System.out.println("Your Chinese zodiac sign is a Monkey");
		System.out.println("The Monkey is the ninth of 12 animals in the recurring 12-year Chinese zodiac cycle.");
		System.out.println("People born in a year of the Monkey have magnetic personalities and are witty and intelligent. Personality traits like mischievousness, curiosity, and cleverness make them very naughty.");
		
	}
	
    public static void Rooster() {
		
		System.out.println("Your Chinese zodiac sign is a Rooster");
		System.out.println("The Rooster is 10th among the 12 animals in the Chinese zodiac cycle. Every 12 years is a Rooster year, beginning at Chinese New Year.");
		System.out.println("People born in a year of the Rooster are very observant. Hardworking, resourceful, courageous, and talented, Roosters are very confident in themselves.");
		
	}

    public static void Dog() {
	
	System.out.println("Your Chinese zodiac sign is a Dog");
	System.out.println("The Dog occupies the 11th position in the Chinese zodiac after the Rooster and before the Pig.");
	System.out.println("Dogs are loyal and honest, amiable and kind, cautious and prudent. Due to having a strong sense of loyalty and sincerity, Dogs will do everything for the person who they think is most important.");
	
    }
    
    public static void Pig() {
    	
	System.out.println("Your Chinese zodiac sign is a Pig");
	System.out.println("The Pig is the 12th of 12 animals in the recurring 12-year Chinese zodiac cycle.");
	System.out.println("Pigs are diligent, compassionate, and generous. They have great concentration: once they set a goal, they will devote all their energy to achieving it.");
	
    }
    
    public static void Rat() {
    	
	System.out.println("Your Chinese zodiac sign is a Rat");
	System.out.println("The Year of the Rat is the first zodiac sign in the Chinese zodiac cycle.");
	System.out.println("With strong intuition and quick responses, Rats always easily adapt themselves to a new environment.");
	
    }
    
    public static void Ox() {
    	
	System.out.println("Your Chinese zodiac sign is an Ox");
	System.out.println("The Ox occupies the second position in the Chinese Zodiac.");
	System.out.println("Oxes are known for diligence, dependability, strength and determination. Having an honest nature, Oxes are strongly patriotic, have ideals and ambitions for life, and attach importance to family and work. ");
	
    }
    
    public static void Tiger() {
    	
	System.out.println("Your Chinese zodiac sign is a Tiger");
	System.out.println("The Tiger ranks third among the animals in the Chinese zodiac.");
	System.out.println("People born in a year of the Tiger are brave, competitive, unpredictable, and confident. They are very charming and well-liked by others. But sometimes they are likely to be impetuous, irritable, and overindulged.");
	
    }
    
    public static void Rabbit() {
    	
    	System.out.println("Your Chinese zodiac sign is a Rabbit");
    	System.out.println("The Year of the Rabbit is fourth in the Chinese zodiac cycle.");
    	System.out.println("Rabbits tend to be gentle, quiet, elegant, and alert as well as quick, skillful, kind, patient, and very responsible. However, they might be superficial, stubborn, melancholy, and overly-discreet. ");
    	
        }
    
    public static void Dragon() {
    	
    	System.out.println("Your Chinese zodiac sign is a Dragon");
    	System.out.println("The Dragon is the fifth of the 12 Chinese zodiac animals.");
    	System.out.println("Among the Chinese zodiac animals, the dragon is the sole imaginary animal. The Chinese dragon is the most vital and powerful beast in the Chinese zodiac, although Dragons have an infamous reputation for being a hothead and possessing a sharp tongue. ");
    	
        }
    
    public static void Snake() {
    	
    	System.out.println("Your Chinese zodiac sign is a Snake");
    	System.out.println("The Snake occupies the sixth position in the Chinese zodiac.");
    	System.out.println("In Chinese culture, the Snake is the most enigmatic animal among the 12 zodiac animals. People born in a year of the Snake are supposed to be the most intuitive.");
    	
        }
    
    public static void Horse() {
    	
    	System.out.println("Your Chinese zodiac sign is a Horse");
    	System.out.println("The Horse occupies the seventh position in the Chinese zodiac, after the Snake and before the Goat.");
    	System.out.println("People born in a year of the Horse are extremely animated, active and energetic. Horses love to be in a crowd, and they can usually be seen on such occasions as concerts, theater performances, meetings, sporting events, and parties.");
    	
        }
    
    public static void Goat() {
    	
    	System.out.println("Your Chinese zodiac sign is a Goat");
    	System.out.println("The Goat is eighth in the Chinese zodiac cycle.");
    	System.out.println("People born in a year of the Goat are generally believed to be gentle, mild-mannered, shy, stable, sympathetic, amicable, and brimming with a strong sense of kindheartedness and justice.");
    	
        }




	
	public static void main(String []args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your year or birth?");
		int year = scan.nextInt();
		
		int animal = year % 12;
		
		if(animal == 0)
			Monkey();
		
		else if (animal == 1)
			Rooster();
		
		else if (animal == 2)
			Dog();
		
		else if (animal == 3)
			Pig();
		
		else if (animal == 4)
			Rat();
		
		else if (animal == 5)
			Ox();
		
		else if (animal == 6)
			Tiger();
		
		else if (animal == 7)
			Rabbit();
		
		else if (animal == 8)
			Dragon();
		
		else if (animal == 9)
			Snake();
		
		else if (animal == 10)
			Horse();
		
		else if (animal == 11)
			Goat();
			
		
		
		scan.close();
		
	}
	
	}
	
	