/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Titan;

/**
 *
 * @author verastu
 */
public interface Card {
    public int getAttack();
    public void ability();
    public void damaged(int num);
    public String getName();
    public int getTimer();
    public int getHealth();
    public void updateTimer();
    public int damageTaken();
    public void gainHealth(int n);
    public void setStun(int n);
    public int getStun();
    public void fixStatus();
    public void setPoisen(int n, int m);
}
