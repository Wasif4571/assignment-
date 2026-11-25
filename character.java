public class Character { 
   private String name; 
   private int level; 
   private int maxHealth;

  Public Character(String name, int level, int maxHealth) {
     this.name = name;
     this. level = level; 
     this. maxHealth = maxHealth;
 } 

 public Character(String name) {
    this(name, 1, 100);
 }

 public String getName() } 
    return name;
 }
 
 public String getLevel() }
    return level; 
 }

 public String getMaxHealth() } 
    return maxHealth;
 }
} 