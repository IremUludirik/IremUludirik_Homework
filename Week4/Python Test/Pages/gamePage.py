from selenium.webdriver.common.by import By

class GamePage():
    def __init__(self, driver):
        self.driver = driver

    def test_find(self):
        self.driver.find_element(By.CSS_SELECTOR, "#store_search_link > img").click()
        self.driver.find_element(By.CSS_SELECTOR, ".search_result_row:nth-child(1) img").click()
