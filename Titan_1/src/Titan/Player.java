package Titan;

//The player class holds methods that only the user can see and use
//in a regular game, which is to play a card and attack
public class Player extends Game{
	Player enemy;
	Strategy strat = new Strategy(this); 
	Move move = new Move(this);
	
	
	Player(){readyLib(this); setPlayer(this);} 
	
	public void setEnemy(Player obj){enemy = obj;} 
	
	public void newTurn(){
		updateCardtimer();
		draw();
	}
	
	private void updateCardtimer(){
		if(handlength > 0){
			for(int i = 0; i < handlength; i+=1)
				getCardhand(i).updateTimer();
			for(int i = 0; i < enemy.getHandlength(); i +=1)
				enemy.getCardhand(i).updateTimer();
		}
	}
	//Play a card(s) from hand and use their abilities if timing is right
	//moves a card object from the hand array to the field array
	public void playCard(Card obj){placeCard(obj);} 
	
	//Moves the game from playing a card to attacking
	//calls method to drive the attack phase
	public void attack(){
		
		startObserv();
		for(int i = 0; i < getFieldlength(); i +=1){
			if(enemy.getFieldcard(i).getName().equals("No card"))
				enemy.directDamage(getFieldcard(i).getAttack());
			else
				{enemy.getFieldcard(i).damaged(getFieldcard(i).getAttack());
				enemy.deadCard(enemy.getFieldcard(i), i);}
		}
		endObserv();}
}
