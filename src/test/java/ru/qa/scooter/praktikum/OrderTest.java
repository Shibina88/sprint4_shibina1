package ru.qa.scooter.praktikum;

import org.junit.Test;
import ru.qa.scooter.praktikum.page.MainPage;
import ru.qa.scooter.praktikum.page.OrderPage;
import ru.qa.scooter.praktikum.page.RentPage;


public class OrderTest extends BaseTest {
    @Test // кнопка Заказать в верхнем блоке
    public void createOrderHead() {
        MainPage mainPage = new MainPage(webDriver); //
        mainPage.cookieCloseWind();// приняли куки, закрыли сообщение о куки
        mainPage.clickCreateOrder();//нажали на кнопку заказать

        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.fillCustomerInfo("Имя", "Фамилия", "Адрес", "Арбатская", "+79663225623"); // Заполнили форму Для кого самокат
        orderPage.clickNextBtn(); //кнопка перехода на форму Про аренду

        RentPage rentPage = new RentPage(webDriver);
        rentPage.fillRentInfo("25.05.2025", "сутки"); //заполнили форму Про Аренду
        rentPage.createOrder(); //нажали Создать заказ (кнопка Заказать)
        rentPage.arrangeYes(); //в окне Хотите оформить заказ нажали Да
        rentPage.viewOrderStatus(); // к оне Заказ оформлен нажали Посмотреть статус

    }

    @Test // кнопка Заказать в нижнем блоке
    public void createOrderFooter() {
        MainPage mainPage = new MainPage(webDriver); //
        mainPage.cookieCloseWind();// приняли куки, закрыли сообщение о куки

        mainPage.clickFooterCreateOrder();//нажали на кнопку заказать в нижнем блоке

        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.fillCustomerInfo("Имя", "Фамилия", "Адрес", "Арбатская", "+79663225623"); // Заполнили форму Для кого самокат
        orderPage.clickNextBtn(); //кнопка перехода на форму Про аренду

        RentPage rentPage = new RentPage(webDriver);
        rentPage.fillRentInfo("25.05.2025", "сутки"); //заполнили форму Про Аренду
        rentPage.createOrder(); //нажали Создать заказ (кнопка Заказать)
        rentPage.arrangeYes(); //в окне Хотите оформить заказ нажали Да
        rentPage.viewOrderStatus(); // в окне Заказ оформлен нажали Посмотреть статус

    }
}
