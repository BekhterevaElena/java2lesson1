public class Main {

	public static void main(String[] args) {

		Object[] members = new Object[3];
		members[0] = new Cat(2,100);
		members[1] = new Human(5,50);
		members[2] = new Robot(100,1000);

		Object[] obstacleСourse = new Object[4];
		obstacleСourse[0] = new Treadmill(2);
		obstacleСourse[1] = new Wall(1);
		obstacleСourse[2] = new Treadmill(100);
		obstacleСourse[3] = new Wall(5);

		for (int i = 0; i < members.length; i++) {
			for (int j = 0; j < obstacleСourse.length; j++) {
				String c=members[i].getClass().getName();
				switch (c){
					case "Cat":
					Cat cat=(Cat)members[i];
					if(obstacleСourse[j].getClass().getName()=="Wall")
					cat.jump(Integer.parseInt(obstacleСourse[j].toString()));
					else cat.run(Integer.parseInt(obstacleСourse[j].toString()));
					break;
					case "Human":
					Human man=(Human)members[i];
						if(obstacleСourse[j].getClass().getName()=="Wall")
							man.jump(Integer.parseInt(obstacleСourse[j].toString()));
						else man.run(Integer.parseInt(obstacleСourse[j].toString()));
					break;
					case "Robot":
						Robot robot=(Robot)members[i];
						if(obstacleСourse[j].getClass().getName()=="Wall")
							robot.jump(Integer.parseInt(obstacleСourse[j].toString()));
						else robot.run(Integer.parseInt(obstacleСourse[j].toString()));
						break;

				}
			}

		}

	}
}
