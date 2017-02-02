package Titan;

import java.util.Random;

public class Game {
	private int health = 1200;
	private int decksize = 10;
	private Card[] deck = new Card[decksize];
	private int handsize = 5;
	private Card[] hand = new Card[handsize];
	private int fieldsize = 5;
	private Card[] field = new Card[fieldsize];
	private int cementarysize = 10;
	private Card[] cementary = new Card[cementarysize];
	private Cardlib lib = new Cardlib(); 
	private Subject observ = new Subject();
	private Player self;
	private int decklength = 0;
	protected int handlength = 0;
	protected int fieldlength = 0;
	private int cementarylength = 0; 
	
	Game(){
		/**constructor to call the setHand, setField, setDeck, setCementary methods*/
	}
	
	public void setPlayer(Player obj){this.self =obj;}
	
	public void setDeck(){
		deck[0] = lib.lion(); 
		deck[1] = lib.spider();
		deck[2] = lib.orcsoldier(); 
		deck[3] = lib.flamewyvern();
		deck[4] = lib.swampwolf();
		deck[5] = lib.dripfairy();
		deck[6] = lib.snowoakfairy(); 
		deck[7] = lib.vikingchief();
		deck[8] = lib.vampirebat();
		deck[9] = lib.tundratroll();
		decklength = 10;
		
		shuffle();
	}
	
	private void shuffle(){
		Random rnd = new Random();
		for(int i = decklength - 1; i > 0; i -=1){
			
			int a = rnd.nextInt(i + 1);
			Card b = deck[a];
			deck[a] = deck[i];
			deck[i] = b;
		}
	}
	
	public void setField(){
		for(int i = 0; i < fieldsize; i +=1){
			field[i] = lib.nocard();
		}
	}
	
	public void setCementary(){
		for(int i = 0; i < cementarysize; i +=1){
			cementary[i] = lib.nocard();
		}
	}
	
	public void readyLib(Player obj){lib.setPlayer(obj);}
	
	public void setHand(){
		for(int i = 0; i < handsize; i +=1){
			hand[i] = lib.nocard();
		}
	}
	
	//adjust health to the direct damage
	public void directDamage(int n){health -= n;}
	
	//return player health
	public int getHealth(){return health;}
	
		
	//get teh amount of cards in the cementary
	public Card getCementary(int n){
		return cementary[n];} 
		
	//get the amount of cards in the cementary 
	public Card getFieldcard(int n){
		return field[n];
	} 
		
	//uses the rune if conditions are met
	public void activateRune(){
		/**check to see if requirements are met for the rune
		 * -3 cards in the enemy cementary
		 * -if met, can attack a random enemy card for 75 damage
		 * -attacks at every enemy and player turn 
		 * -only works for 3 turns of the entire duel
		 * 
		 * will need data of the following fields
		 * enemy field[]
		 * enemy cementary[]
		 * health of enemy cards on the field*/
	}
	
	
		
		
		//put a card from the field to the cementary 
		//moves a card from the field array to the cementary array
	protected void deadCard(Card obj, int i){
		if(obj.getHealth() <=0){
			cementary[cementarylength] = field[i];
			field[i] = lib.nocard(); 
			cementarylength +=1;
			fieldlength -=1;
		}
	} 
	
		//draw a card from the deck to the hand
		//puts the 1t real card object from the deck array to the hand array
	
    
	
	public void draw(){
		if(decklength > 0){
			addHand(getDeck());
			decklength -=1;
		}
		adjustDeck();
	}
	
    public void addHand(Card obj){
		hand[handlength] = obj;
		handlength +=1;
	}
    
    public Card getDeck(){
		Card top = deck[0];
		deck[0] = lib.nocard();
		return top;
	}
    
    public void adjustDeck(){
		for(int i = 0; i < decklength; i +=1){
			if(deck[i].getName().equals("No card") && i < decklength){
				for(int j = i; j < decklength; j +=1){
					deck[j] = deck[j +1];
					deck[j+1] = lib.nocard();
				}
				break;
			}
		}
	} 
    
	public void placeCard(Card obj){
		addField(obj);
		adjustHand(obj);
		
	}
	
	public void addField(Card obj){
		if(fieldlength <5){
			field[fieldlength] = obj;
			fieldlength +=1;
		}
		
	}
	
	public void adjustHand(Card obj){
		for(int i = 0; i < handlength; i +=1){
			if(hand[i].getName().equals(obj.getName())){
				hand[i] = lib.nocard(); handlength -=1; break;
			}}
		for(int i = 0; i < handlength; i +=1){
			if(hand[i].getName().equals(obj.getName())){
				if( i < handlength){
					for(int j = i; j < handlength; j +=1)
					{
						hand[j] = hand[j+1];
						hand[j+1] = lib.nocard();
					}
					break;
				}
			}
		}
	}
	
	public void adjustField(){
		for(int i = 0; i < fieldlength; i +=1){
			if(field[i].getName().equals("No card")){
				for(int j = i; j < fieldlength; j +=1){
					field[j] = field[j+1];
					field[j+1] = lib.nocard();
				}
				break;
			}
		}
	}
	
	public void startObserv(){
		
    		observ.setHitsList(self.getFieldcard(0),self.getFieldcard(1),self.getFieldcard(2),
    				self.getFieldcard(3), self.getFieldcard(4));
    		observ.setNameList(self.getFieldcard(0),self.getFieldcard(1),self.getFieldcard(2),
    				self.getFieldcard(3), self.getFieldcard(4));
    		}
	
	public void endObserv(){
		observ.updateHitsList(self.getFieldcard(0),self.getFieldcard(1),self.getFieldcard(2),
				self.getFieldcard(3), self.getFieldcard(4));
		observ.setNameList(self.getFieldcard(0),self.getFieldcard(1),self.getFieldcard(2),
				self.getFieldcard(3), self.getFieldcard(4));
	}
	public int getHandlength(){return handlength;}
	public int getDecklength(){return decklength;}
	public int getFieldlength(){return fieldlength;}
	public int getCementarylength(){return cementarylength;}
	public Card getCardhand(int n){return hand[n];}
        
        
}
