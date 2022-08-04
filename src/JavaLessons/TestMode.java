package JavaLessons;

import JavaLessons.Packet1.Bob;

public class TestMode extends Bob {


        //public, protected, default(доступно в пределах этого пакета), private(доступно в пределах пакета,
        //иерархии наследования(в классах-потомках с других пакетов)).

        public TestMode(){
            name = "Tom";
        }

}