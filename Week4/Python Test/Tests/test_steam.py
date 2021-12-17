import pytest
from selenium import webdriver
from Pages.homePage import HomePage
from Pages.gamePage import GamePage
from Pages.basketPage import BasketPageAdd
from Pages.basketPage import BasketPageRemove


class TestSteam():
    @classmethod
    @pytest.fixture()
    def test_setup(self):
        global driver
        driver = webdriver.Chrome(
            executable_path=r"C:\Users\irem6.DESKTOP-8MQ14NE\OneDrive\Masaüstü\chromedriver_win32\chromedriver.exe")
        driver.implicitly_wait(8)
        driver.maximize_window()

    def test_search(self, test_setup):
        # search
        mykeyword = "Portal 2"
        home = HomePage(driver)
        home.test_search(mykeyword)

    def test_find(self):
        # find
        find = GamePage(driver)
        find.test_find()

    def test_add(self):
        # add
        mykeyword = "Portal 2"
        basket = BasketPageAdd(driver)
        basket.test_add(mykeyword)

    def test_remove(self):
        # remove
        remove = BasketPageRemove(driver)
        remove.test_remove()

    @classmethod
    def tear_down(self):
        driver.close()
        driver.quit()
