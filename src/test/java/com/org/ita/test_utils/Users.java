package com.org.ita.test_utils;

import com.org.ita.kata.Eight;
import com.org.ita.kata.Seven;
import com.org.ita.kata.Six;
import com.org.ita.kata.Five;

public enum Users {
    ANDRIY_LIUTAK(1, "Andrij Liutak", 
    		new com.org.ita.kata.implementation.andriy66.Eigth(),
    		new com.org.ita.kata.implementation.andriy66.Seven(),
    		new com.org.ita.kata.implementation.andriy66.Six(),
    		new com.org.ita.kata.implementation.andriy66.Five()
    		),
    ANDRIJ_BARSKYI(2, "Andrij Barskyi", 
    		new com.org.ita.kata.implementation.AndriyBarskyi.Eigth(),
    		new com.org.ita.kata.implementation.AndriyBarskyi.Seven(),
    		new com.org.ita.kata.implementation.AndriyBarskyi.Six(),
    		new com.org.ita.kata.implementation.AndriyBarskyi.Five()
    		),
	 ANDRII_PETRIVSKYI(3, "Andrii Petrivskyi", 
	    	new com.org.ita.kata.implementation.MakKeywa.Eigth(),
	    	new com.org.ita.kata.implementation.MakKeywa.Seven(),
	    	new com.org.ita.kata.implementation.MakKeywa.Six(),
	    	new com.org.ita.kata.implementation.MakKeywa.Five()
	    	),
	 MYKHAILO_MYKHAILYSHYN(4, "Mykhailo Mykhailyshyn", 
		    new com.org.ita.kata.implementation.Mykhailo5.Eigth(),
		    new com.org.ita.kata.implementation.Mykhailo5.Seven(),
		    new com.org.ita.kata.implementation.Mykhailo5.Six(),
		    new com.org.ita.kata.implementation.Mykhailo5.Five()
		    ),
	 NADYA_BRYASHCHEY(5, "Nadya Bryashchey", 
		    new com.org.ita.kata.implementation.Nadya101.Eigth(),
		    new com.org.ita.kata.implementation.Nadya101.Seven(),
		    new com.org.ita.kata.implementation.Nadya101.Six(),
		    new com.org.ita.kata.implementation.Nadya101.Five()
		    ),
	 NATALIA_SKRYPAK(6, "Natalia Skrypak", 
		    new com.org.ita.kata.implementation.nataskrypak.Eigth(),
		    new com.org.ita.kata.implementation.nataskrypak.Seven(),
		    new com.org.ita.kata.implementation.nataskrypak.Six(),
		    new com.org.ita.kata.implementation.nataskrypak.Five()
		    ),
	 VITALII_PIDSTAVSKYI(7, "Vitalii Pidstavskyi",
			new com.org.ita.kata.implementation.Pidstavskiy.Eigth(),
		    new com.org.ita.kata.implementation.Pidstavskiy.Seven(),
		    new com.org.ita.kata.implementation.Pidstavskiy.Six(),
		    new com.org.ita.kata.implementation.Pidstavskiy.Five()
		    ),
	 VOLODYMYR_YAMNYI(8, "Volodymyr Yamnyi",
			new com.org.ita.kata.implementation.vy1989.Eigth(),
		    new com.org.ita.kata.implementation.vy1989.Seven(),
		    new com.org.ita.kata.implementation.vy1989.Six(),
		    new com.org.ita.kata.implementation.vy1989.Five()
     );
	 
	

    private final int id;
    private final String name;
    private final Eight eigth;
    private final Seven seven;
    private final Six six;
    private final Five five;

    Users(int id, String name, Eight eigth, Seven seven, Six six, Five five) {
        this.id = id;
        this.name = name;
        this.eigth = eigth;
		this.seven = seven;
		this.six = six;
		this.five = five;
    }

    public String getName() {
        return this.name;
    }

    public Eight getEigth() {
        return this.eigth;
    }
    public Seven getSeven() {
        return this.seven;
    }
    public Six getSix() {
        return this.six;
    }
    public Five getFive() {
        return this.five;
    }

    public static Users getById(int userId){
        for (Users user : Users.values()) {
            if(user.id == userId){
                return user;
            }
        }
        return null;
    }

    public static void printAllUserName() {
        for (Users user : Users.values()) {
            System.out.println("Id: "+user.id + " Name: " + user.name);
        }
    }
}
