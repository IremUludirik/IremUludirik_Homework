from selenium.webdriver.common.by import By

class HomePage():
    def __init__(self, driver):
        self.driver = driver
        self.searchBox_id = "store_nav_search_term"

    def test_search(self, keyword):
        self.driver.get("https://store.steampowered.com/")
        self.driver.find_element(By.ID, self.searchBox_id).click()
        self.driver.find_element(By.ID, self.searchBox_id).send_keys(keyword)
        self.driver.find_element(By.ID, "store_search").click()
