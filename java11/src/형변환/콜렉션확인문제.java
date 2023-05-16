package 형변환;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 콜렉션확인문제 {

	public static void main(String[] args) {
		// 1. 한번 갔던 여행지는 가지 않으려고 합니다. 가고 싶은 여행지 5곳을 컬렉션으로 만들어서
		//    전체 프린트 (중복제거!! ==> set)
		HashSet tour = new HashSet();
		tour.add("제주도");
		tour.add("강릉");
		tour.add("목포");
		tour.add("독도");
		tour.add("울릉도");
		System.out.println(tour);
		// 2. 각 방에 물건 배치입니다. 안방에는 TV, 거실에는 소파, 부엌에는 냉장고, 현관에는
		//    신발의 정보를 컬렉션으로 만들어서 1) 전체프린트, 2) 현관에는 무엇이 있나요?
		//    3) 거실에 책상으로 변경하여 전체 프린트 (키 + 값 쌍으로 넣을 때는! ==> map)
		HashMap room = new HashMap();
		room.put("안방", "TV");
		room.put("거실", "쇼파");
		room.put("부엌", "냉장고");
		room.put("현관", "신발");
		System.out.println(room);
		System.out.println(room.get("현관"));
		room.replace("거실", "책상"); // room.put("거실", "책상) 이렇게 넣어도 대체되어 들어감
		System.out.println(room);
		// 3. 오늘 내가 할일 우선순위 5개 목록을 만들어서 1) 전체 프린트,
		//    2) 첫번째 할 일과 마지막 할 일 프린트, 3) 2번째 할 일을 "청소"로
		//    변경해서 전체 프린트 (순서가 있는 것 ==> List(ArrayList))
		LinkedList work = new LinkedList();
		work.add("코딩");
		work.add("밥먹기");
		work.add("커피마시기");
		work.add("놀기");
		work.add("자기");
		System.out.println(work);
		System.out.println(work.get(0));
		System.out.println(work.get(work.size()-1));
		work.set(1, "청소");
		System.out.println(work);
		

	}

}
