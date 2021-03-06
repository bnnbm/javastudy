package family;

public class chdfamily {
		private int no;
		private String name;
		private int age;
		private String job;
		private int gender;
		
		public chdfamily(String name, int age, String job, int gender) {
			this.name = name;
			this.age = age;
			this.job = job;
			this.gender = gender;
		}
		
		public chdfamily(int no, String name, int age, String job, int gender) {
			super();
			this.no = no;
			this.name = name;
			this.age = age;
			this.job = job;
			this.gender = gender;
		}
		
		//getter, setter, toString

		public int getNo() {
			return no;
		}

		public void setNo(int no) {
			this.no = no;
		}
			
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getJob() {
			return job;
		}

		public void setJob(String job) {
			this.job = job;
		}

		public int getGender() {
			return gender;
		}

		public void setGender(int gender) {
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "번호:" + no + ", 이름:" + name + ", 나이:" + age + ", 직업:" + job + ", 성별:" + ((gender==1)?"남자":"여자");
		}
		
}	
