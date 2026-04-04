package org.bluebride.design_pattern._03_structure.facade.facade1;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        //不直接调用各个对象，通过外观类调用子对象
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        System.out.println("--------------------------------");
        homeTheaterFacade.ready();
        System.out.println("--------------------------------");
        homeTheaterFacade.play();
        System.out.println("--------------------------------");
        homeTheaterFacade.puse();
        System.out.println("--------------------------------");
        homeTheaterFacade.end();
        System.out.println("-------------------------------- ");
    }
}
