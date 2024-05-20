package chap07.ProgrammingTask09;

class Hotel {
    private Room[] rooms;

    public Hotel() {
        rooms = new Room[10];
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room(i + 1);
        }
    }
    public void add(int roomNumber, String guestName) {
        if (roomNumber < 1 || roomNumber > 10) {
            System.out.println("잘못된 객실 번호입니다.");
            return;
        }
        rooms[roomNumber - 1].reserve(guestName);
    }

    // 예약 현황 보여주는 메소드
    public void show() {
        for (Room room : rooms) {
            room.display();
        }
    }

    private static class Room {
        private int number;
        private String guestName;

        public Room(int number) {
            this.number = number;
        }


        public void reserve(String guestName) {
            this.guestName = guestName;
        }

        public void display() {
            if (guestName != null) {
                System.out.println(number + "번 방을 " + guestName + "가 예약했습니다.");
            }
        }
    }
}