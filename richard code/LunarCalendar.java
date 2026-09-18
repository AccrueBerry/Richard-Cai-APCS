import java.net.SocketImpl;
import java.net.SocketPermission;
import java.util.Scanner;

import javax.sound.SoundClip;

class LunarCalendar{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello!");
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("What year were you born?");
        int year = scan.nextInt();
        int zodiaci = (year-4)%12;
        if (zodiaci == 0){
            System.out.println("Well, " + name + "! Your chinese zodiac animal is the rat. The chinese zodiac Rat's personality is outgoing, cheerful, and sociable in character. They can get along well with different people, so there are a lot of friends around them. No matter what jobs they are occupied, they can harvest success on account of their quick response to outside changes. Facing hardships, they show bold and positive personality traits. Due to their acute instinct and calmness, they can do well in business. Disaster will make their capability more outstanding. Some live a thrifty life but still strive hard in work.");
        }
        if (zodiaci == 1){
            System.out.println("Well, " + name + "! On the one hand, Earth, the fundamental element of Ox, is characterized by its heaviness, stability, inclusiveness, and resistance to change. On the other hand, in Chinese culture, the Ox is portrayed in this way: it works from sunrise to sunset and is always diligent; it is not picky about food and can work for long periods after eating, very reliable; it is very stubborn that refuses to move if it doesn’t want to, even when led by a rope… Similarly, people with the Chinese zodiac Ox sign are often steady, patient, yet stubborn.");
        }
        if (zodiaci == 2){
            System.out.println("Well, " + name + "! Your chinese zodiac animal is the tiger. Since the element for the Chinese zodiac sign of the Tiger is wood, people born in the year of the Tiger carry the trait of Wood in their personality. In Chinese culture, Wood represents not only trees. In a positive sense, Wood shows a thriving, developed, and upward state; while, in a negative sense, if the force for thriving is too strong, it will become an uncontrollable impulse. Accordingly, in terms of personality, Tigers generally crave achievement and have a straightforward and confident personality, but at the same time, they may be impulsive, lack patience, and have a strong desire for control.");
        }
        if (zodiaci == 3){
            System.out.println("Well, " + name + "! Your chinese zodiac animal is the rabbit. People born in the Year of the Rabbit are gentle, peace-loving, and well-mannered. They have a quiet charm and a keen sense of observation. Though they seem soft and easygoing, they are actually quite resilient and responsible. Rabbits dislike conflict and prefer to solve problems through calm communication and compromise. Their patience and natural grace make them popular in social circles.");
        }
        if (zodiaci == 4){
            System.out.println("Well, " + name + "! Your chinese zodiac animal is the dragon. People born in the Year of the Dragon are natural leaders, ambitious, exceptionally intelligent, full of energy, confident, and charismatic. They often carry a powerful aura, leaving others an impression of being favored by heaven. However, if not kept in check, their strong self-confidence can easily develop into arrogance and conceit.");
        }
        if (zodiaci == 5){
            System.out.println("Well, " + name + "! Your chinese zodiac animal is the snake. People born in the Year of the Snake are natural philosophers: calm, intuitive, and deeply thoughtful. They observe more than they express, which often gives them an air of mystery. Though not showy, their quiet confidence and elegance make them stand out. However, their tendency to be overly cautious or secretive can sometimes be mistaken as coldness.");
        }
        if (zodiaci == 6){
            System.out.println("Well, " + name + "! Your chinese zodiac animal is the horse. Since their element is Fire, which symbolizes enthusiasm and vitality, people born in the year of the Horse are generally freedom-loving, proactive, and straightforward; however, they can also be impatient and impulsive on the other hand.");
        }
        if (zodiaci == 7){
            System.out.println("Well, " + name + "! Your chinese zodiac animal is the sheep. People born in the Year of the Goat are gentle, kind, and deeply loyal to family and close friends. Among the twelve zodiac animals, the Sheep is the only one that kneels while nursing, symbolizing filial devotion. Outwardly soft and modest, Sheep people possess a quiet inner strength that shows itself when protecting loved ones or standing up for what matters to them.However, Sheep people can sometimes be overly sensitive and hesitant when making decisions. This cautious nature, while helping them avoid mistakes, may cause them to miss good opportunities.");
        }
        if (zodiaci == 8){
            System.out.println("Well, " + name + "! Your chinese zodiac animal is the monkey. People born in the Year of the Monkey share many traits with the animal monkeys: they are quick-witted, intelligent, and lively. However, they also have flaws, tending to be impulsive and restless.");
        }
        if (zodiaci == 9){
            System.out.println("Well, " + name + "! Your chinese zodiac animal is the rooster. According to Chinese zodiac, the personalities of Rooster persons have some connections with the natural instincts and inherent habits of roosters. Roosters crow right on time to welcome dawn, a trait that shows itself in Rooster people as innate punctuality, self-discipline, and diligent motivation. Their upright posture and spirited bearing correspond to peoples pursuit of neat personal images and proper manners. Endowed with natural quick wit and vigilance, roosters’ inherent qualities are mirrored in these peoples flexible thinking and decisive conduct. In addition, Roosters are born competitive, and this characteristic is also reflected in their unwillingness to back down or admit failure easily.");
        }
        if (zodiaci == 10){
            System.out.println("Well, " + name + "! Your chinese zodiac animal is the dog. Dogs are naturally loyal, affectionate, sharp, and vigilant. Likewise, those born under the Dog sign are sincere, steadfast, and justice-minded, with outstanding powers of observation. However, their straightforward and resolute nature makes them inclined to hold fast to their views and lack flexibility.");
        }
        if (zodiaci == 11){
            System.out.println("Well, " + name + "! Your chinese zodiac animal is the pig. Innate characteristics of every zodiac animal typically manifest in the temperament of those born under its sign. Docile, calm, and easygoing by nature, the pig passes these dispositions to most Pig persons, who tend to be sincere in interpersonal interactions, generous-minded and appreciative of lifes simple pleasures. Still, the pigs preference for comfort and dislike of relentless toil may make people of this sign prone to staying within their comfort zones and short on motivation to forge ahead.");
        }
    }
}
