import time
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait

class BasketPageAdd():
    def __init__(self, driver):
        self.driver = driver

    def test_add(self, keyword):
        time.sleep(6)
        self.driver.find_element(By.XPATH, "//a[@href='javascript:addToCart(7877);']/span[.='Sepete Ekle']").click()
        self.driver.find_element(By.CSS_SELECTOR, ".page_header_ctn").click()
        WebDriverWait(self.driver, 8).until(
            expected_conditions.visibility_of_element_located((By.CSS_SELECTOR, ".pageheader")))
        assert self.driver.find_element(By.LINK_TEXT, keyword).text == keyword


class BasketPageRemove():
    def __init__(self, driver):
        self.driver = driver

    def test_remove(self):
        self.driver.find_element(By.CSS_SELECTOR, ".remove_link[href = 'javascript:void(0);']").click()
        self.driver.find_element(By.CSS_SELECTOR, ".btn_green_steamui > span").click()
        WebDriverWait(self.driver, 8).until(
            expected_conditions.visibility_of_element_located((By.CSS_SELECTOR, ".pageheader")))
        assert self.driver.find_element(By.ID, "cart_estimated_total").text == "0,00 TL"
        self.driver.find_element(By.XPATH, "//span[contains(.,'Alışverişe Devam Et')]").click()
