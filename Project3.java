class Character {
    int age;
    String role;

    Character(int num, String string) {
        age = num;
        role = string;
    }

    void introdueYoreself() {
        System.out.println("저는 가족 구성원 중" + role + "이고" + age + "살 입니다");
    }
}

public class Project3 {
    public static void main(String[] args) {
        Character 짱구 = new Character(5, "son");
        Character 짱아 = new Character(1, "daughter");

        짱구.introdueYoreself();
        짱아.introdueYoreself();


        //1번 everywhere 출력
        //2번
       /* int result = 0;
        int i = 1;
        while (i <= 1000) {
            if (i % 3 == 0) {
                result += i;
            }
            i ++;
        }
        System.out.println(result);
        //3번 이거 왜 안 되는건지 모르겠어요ㅜㅠㅜㅠ
        while (true) {
            int i = 0;
            i++;
            if (i > 5) {
                break;
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        //4번
        for (int i = 1; i < 101; i++) {
            System.out.println(i);

        //5번
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        float average = sum / 10;
        System.out.println(average);*/
    }
}