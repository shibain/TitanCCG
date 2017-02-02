/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Titan;

/**
 *
 * @author fredpad
 */
public class Cardlib {
	Player player; 
	
	public void setPlayer(Player obj){player = obj;}
    
        /**Also damages the enemy health by 90% of the physical damage dealt 
         *to an enemy card*/
	public class Lion implements Card{
		private int attack = 100;
        private int health = 250;
        private int turn_timer = 2;
        private String name = "Lion";
        private int damagetaken = 0;
    	private int stun = 0;
    	private int poisened = 0;
    	private int poisen = 0;
    	
    	public void setStun(int n){stun = n;}
		public int getStun(){return stun;}
        
        public int getAttack(){return attack;}
        public void damaged(int num){health -= num;}
        public void ability(){} 
        
        public String getName(){return name;}
		
		public int getTimer() {return turn_timer;}
		
		public int getHealth() { return health;}
		public void updateTimer(){if(turn_timer > 0)turn_timer -=1;}
		public int damageTaken(){return damagetaken;}

		public void gainHealth(int n){health += n;}
		@Override
		public void fixStatus() {
			stun -=1;
			if(poisen > 0 && health > 0){
				health -= poisened;
				poisen -=1; 
			}
			
		}
		@Override
		public void setPoisen(int n, int m) {
			// TODO Auto-generated method stub
			
		}
               
    }
        
        /**SPider has the ability to deal 20 damage to a random enemy card
         * and does another 20 damage to the same card at the end of the enemy's next turn*/
	public class Spider implements Card{
        private int attack = 55;
        private String name = "Spider";
        private int health = 150;
        private int turn_timer = 2;
        private int damagetaken = 0;
    	private int stun = 0;
    	private int poisened = 0;
    	private int poisen = 0;
    	
    	public void setStun(int n){stun = n;}
		public int getStun(){return stun;}
        
        public int getAttack(){return attack;}
        public void damaged(int num){health -= num; damagetaken = num;}
        public void ability(){//MAKE RNG FOR ENEMY FIELD POSITION//
        	} 
        
        public String getName(){return name;}
		public int getTimer() {return turn_timer;}
		public int getHealth() {return health;}
		public void updateTimer(){if(turn_timer > 0) turn_timer -=1;}
		public int damageTaken(){return damagetaken;}

		public void gainHealth(int n){health += n;}
		@Override
		public void fixStatus() {
			stun -=1;
			
		}
		@Override
		public void setPoisen(int n, int m) {
			// TODO Auto-generated method stub
			
		}
    }
    
        /**Orc has the ability to reduce physical damage taken by 60*/
	public class Orcsoldier implements Card{
    	private int attack = 120;
    	private String name = "Orc Soldier";
    	private int health = 180; 
    	private int turn_timer = 2; 
    	private int damagetaken = 0;
    	private int stun = 0;
    	private int poisened = 0;
    	private int poisen = 0;
    	
    	public void setStun(int n){stun = n;}
		public int getStun(){return stun;}
    	
    	public int getAttack(){return attack;}
        public void damaged(int num){damagetaken = num - 60;
        if(damagetaken < 0) 
        	{damagetaken = 0;}
        else
        	health -= damagetaken; 
        
        }
        public void ability(){} 
        public String getName(){return name;}
		public int getTimer() {return turn_timer;}
		public int getHealth() {return health;}
		public void updateTimer(){if(turn_timer > 0) turn_timer -=1;}
		public int damageTaken(){return damagetaken;}

		public void gainHealth(int n){health += n;}
		@Override
		public void fixStatus() {
			stun -=1;
			
		}
		@Override
		public void setPoisen(int n, int m) {
			// TODO Auto-generated method stub
			
		}
    }
    
        /***/
    public class Swampwolf implements Card{
    	private int attack = 80;
    	private String name = "Swamp Wolf";
    	private int health = 150; 
    	private int turn_timer = 2; 
    	private int damagetaken = 0;
    	private int stun = 0;
    	private int poisened = 0;
    	private int poisen = 0;
    	
    	public void setStun(int n){stun = n;}
		public int getStun(){return stun;}
    	
    	public int getAttack(){return attack;}
        public void damaged(int num){health -= num; damagetaken = num;}
        public void ability(){} 
        public String getName(){return name;}
		public int getTimer() {return turn_timer;}
		public int getHealth() {return health;}
		public void updateTimer(){if(turn_timer > 0) turn_timer -=1;}
		public int damageTaken(){return damagetaken;}
		public void gainHealth(int n){health += n;}
		@Override
		public void fixStatus() {
			stun -=1;
			
		}
		@Override
		public void setPoisen(int n, int m) {
			// TODO Auto-generated method stub
			
		}
    }
    
    /**Randomly damages an enemy card for 50 with a 50% to stun it for 1 turn*/
    public class Flamewyvern implements Card{
    	private int attack = 150;
    	private String name = "Flame Wyvern";
    	private int health = 250; 
    	private int turn_timer = 4; 
    	private int damagetaken = 0;
    	private int stun = 0;
    	private int poisened = 0;
    	private int poisen = 0;
    	
    	public void setStun(int n){stun = n;}
		public int getStun(){return stun;}
    	public int getAttack(){return attack;}
        public void damaged(int num){health -= num; damagetaken = num;}
        public void ability(){} 
        public String getName(){return name;}
		public int getTimer() {return turn_timer;}
		public int getHealth() {return health;}
		public void updateTimer(){if(turn_timer > 0) turn_timer -=1;}
		public int damageTaken(){return damagetaken;}
		public void gainHealth(int n){health += n;}
		@Override
		public void fixStatus() {
			stun -=1;
			
		}
		@Override
		public void setPoisen(int n, int m) {
			// TODO Auto-generated method stub
			
		}
		
    }
    
    /**Heals the player for 250 health before it attacks*/
    public class Vikingchief implements Card{
    	private int attack = 120;
    	private String name = "Viking Chief";
    	private int health = 180; 
    	private int turn_timer = 2; 
    	private int damagetaken = 0;
    	private int stun = 0;
    	private int poisened = 0;
    	private int poisen = 0;
    	
    	public void setStun(int n){stun = n;}
		public int getStun(){return stun;}
    	
    	public int getAttack(){return attack;}
        public void damaged(int num){health -= num; damagetaken = num;}
        public void ability(){} 
        public String getName(){return name;}
		public int getTimer() {return turn_timer;}
		public int getHealth() {return health;}
		public void updateTimer(){if(turn_timer > 0) turn_timer -=1;}
		public int damageTaken(){return damagetaken;}
		public void gainHealth(int n){health += n;}
		@Override
		public void fixStatus() {
			stun -=1;
			
		}
		@Override
		public void setPoisen(int n, int m) {
			// TODO Auto-generated method stub
			
		}
		
    }
    
    /**Attacks 3 random enemy cards, with a 35% chance to freeze each card for 
     * a single turn*/
    public class Tundratroll implements Card{
    	private int attack = 100;
    	private String name = "Tundra Troll";
    	private int health = 150; 
    	private int turn_timer = 2; 
    	private int damagetaken = 0;
    	private int stun = 0;
    	private int poisened = 0;
    	private int poisen = 0;
    	
    	public void setStun(int n){stun = n;}
		public int getStun(){return stun;}
    	
    	public int getAttack(){return attack;}
        public void damaged(int num){health -= num; damagetaken = num;}
        public void ability(){} 
        public String getName(){return name;}
		public int getTimer() {return turn_timer;}
		public int getHealth() {return health;}
		public void updateTimer(){if(turn_timer > 0) turn_timer -=1;}
		public int damageTaken(){return damagetaken;}
		public void gainHealth(int n){health += n;}
		@Override
		public void fixStatus() {
			stun -=1; 
			
		}
		@Override
		public void setPoisen(int n, int m) {
			// TODO Auto-generated method stub
			
		}
    }
    
    /**Heals a players card that took the most damage during 
     * the enemies turn, for 50 health*/
    public class Dripfairy implements Card{
    	private int attack = 80;
    	private String name = "Drip Fairy";
    	private int health = 150; 
    	private int turn_timer = 2; 
    	private int damagetaken = 0;
    	private Subject abil = new Subject();
    	private boolean abilCall = false;
    	private String toHeal;
    	private int stun = 0;
    	private int poisened = 0;
    	private int poisen = 0;
    	
    	public void setStun(int n){stun = n;}
		public int getStun(){return stun;}
    	
    	public int getAttack(){return attack;}
        public void damaged(int num){health -= num; damagetaken = num;}
        public void ability(){
        	if(abilCall == false){
        		abil.setHitsList(player.getFieldcard(0),player.getFieldcard(1),player.getFieldcard(2),
        				player.getFieldcard(3), player.getFieldcard(4));
        		abil.setNameList(player.getFieldcard(0),player.getFieldcard(1),player.getFieldcard(2),
        				player.getFieldcard(3), player.getFieldcard(4));
        		abilCall = true;
        	}
        	if(abilCall == true){
        		abil.updateHitsList(player.getFieldcard(0),player.getFieldcard(1),player.getFieldcard(2),
        				player.getFieldcard(3), player.getFieldcard(4));
        		abil.updateNamesList(player.getFieldcard(0),player.getFieldcard(1),player.getFieldcard(2),
        				player.getFieldcard(3), player.getFieldcard(4));
        		toHeal = abil.returnBiggest(); 
        	}
        	
        } 
        public void toHeal(){for(int i = 0; i < player.getFieldlength(); i ++){
        	if(player.getFieldcard(i).equals(toHeal))
        		player.getFieldcard(i).gainHealth(50);
        }
        }
        public String getName(){return name;}
		public int getTimer() {return turn_timer;}
		public int getHealth() {return health;}
		public void updateTimer(){if(turn_timer > 0) turn_timer -=1;}
		public int damageTaken(){return damagetaken;}
		public void gainHealth(int n){health += n;}
		@Override
		public void fixStatus() {
			stun -=1;
			
		}
		@Override
		public void setPoisen(int n, int m) {
			// TODO Auto-generated method stub
			
		}
    }
    
    /**Heals itself for 20% of the physical damage dealt*/
    public class Vampirebat implements Card{
    	private int attack = 100;
    	private String name = "Vampire Bat";
    	private int health = 150; 
    	private int turn_timer = 2; 
    	private int damagetaken = 0;
    	private int damagedealt =0;
    	private int stun = 0;
    	private int poisened = 0;
    	private int poisen = 0;
    	
    	public void setStun(int n){stun = n;}
		public int getStun(){return stun;}
    	
    	public int getAttack(){return attack;}
        public void damaged(int num){health -= num; damagetaken = num;}
        public void ability(){health += (int)Math.floor(damagedealt/20);
        if(health > 150) health = 150;} 
        public String getName(){return name;}
		public int getTimer() {return turn_timer;}
		public int getHealth() {return health;}
		public void updateTimer(){if(turn_timer > 0) turn_timer -=1;}
		public int damageTaken(){return damagetaken;}
		public void gainHealth(int n){health += n;}
		
		//must make cards return damage taken
		public void damagedealt(int n){damagedealt = n; ability();}
		@Override
		public void fixStatus() {
			stun -=1 ;
			
		}
		@Override
		public void setPoisen(int n, int m) {
			// TODO Auto-generated method stub
			
		}
    }
    
    /**40% chance to be returned to the hand(deck if hand is full) when 
     * killed on the field*/
    public class Snowoakfairy implements Card{
    	private int attack = 80;
    	private String name = "Snow Oak Fairy";
    	private int health = 150; 
    	private int turn_timer = 2; 
    	private int damagetaken = 0;
    	private int stun = 0;
    	private int poisened = 0;
    	private int poisen = 0;
    	
    	public void setStun(int n){stun = n;}
		public int getStun(){return stun;}
    	
    	public int getAttack(){return attack;}
        public void damaged(int num){health -= num; damagetaken = num;}
        public void ability(){/**RNG FOR 1-100, HAVE AN IF CASE IN DEADCARD TO CHECK FOR THIS CARD*/} 
        public String getName(){return name;}
		public int getTimer() {return turn_timer;}
		public int getHealth() {return health;}
		public int damageTaken(){return damagetaken;}
		public void updateTimer(){if(turn_timer > 0) turn_timer -=1;}
		public void gainHealth(int n){health += n;}
		@Override
		public void fixStatus() {
			stun -=1;
			
		}
		@Override
		public void setPoisen(int n, int m) {
			// TODO Auto-generated method stub
			
		}
		
    }
    
    public class Nocard implements Card{
    	
    	 public int getAttack(){return 0;} 
    	    public void ability(){}
    	    public void damaged(int num){}
    	    public String getName(){return "No card";}
    	    public int getTimer(){return 0;}
    	    public int getHealth(){return 0;}
    		public int damageTaken(){return 0;}
    	    public void updateTimer(){}
    		public void gainHealth(int n){}
    		public void setStun(int n){}
    		public int getStun(){return 0;}
			@Override
			public void fixStatus() {
			
				
			}
			@Override
			public void setPoisen(int n, int m) {
				// TODO Auto-generated method stub
				
			}
    }
    
    public Card dripfairy(){return new Dripfairy();}
    public Card flamewyvern(){return new Flamewyvern();} 
    public Card lion(){ return new Lion();}
    public Card spider(){return new Spider();} 
    public Card orcsoldier(){return new Orcsoldier();} 
    public Card swampwolf(){return new Swampwolf();}
    public Card snowoakfairy(){return new Snowoakfairy();}
    public Card tundratroll(){return new Tundratroll();}
    public Card vampirebat(){return new Vampirebat();}
    public Card vikingchief(){return new Vikingchief();}
    public Card nocard(){return new Nocard();}
    
    
    
}
