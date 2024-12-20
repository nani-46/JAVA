import java.util.Scanner;

public class Participant {
     String name;
     String rollno;
     String age;
     String email;
     String occupation;
     String password;
     String adress;
     private int score;
     private int lifelines;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getScore() {
        return getScore();
    }

    public void setScore(int amount) {
        this.score += amount;
    }

    public int getLifelines() {
        return getLifelines();
    }

    public void useLifeline() {
        if (getLifelines() > 0) {
            lifelines--;
        } else {
            System.out.println("No lifelines left!");
        }
    }
}