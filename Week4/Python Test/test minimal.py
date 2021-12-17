from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait

driver = webdriver.Chrome(
    executable_path=r"C:\Users\irem6.DESKTOP-8MQ14NE\OneDrive\Masaüstü\chromedriver_win32\chromedriver.exe")
driver.implicitly_wait(8)
driver.maximize_window()

driver.get("https://store.steampowered.com/")
driver.find_element(By.ID, "store_nav_search_term").click()
driver.find_element(By.ID, "store_nav_search_term").send_keys("portal")
driver.find_element(By.ID, "store_search").click()
driver.find_element(By.CSS_SELECTOR, "#store_search_link > img").click()
driver.find_element(By.CSS_SELECTOR, ".search_result_row:nth-child(1) img").click()
driver.find_element(By.CSS_SELECTOR, "#btn_add_to_cart_7877 > span").click()
driver.find_element(By.CSS_SELECTOR, ".page_header_ctn").click()
WebDriverWait(driver, 8).until(
    expected_conditions.visibility_of_element_located((By.CSS_SELECTOR, ".pageheader")))
assert driver.find_element(By.LINK_TEXT, "Portal 2").text == "Portal 2"

driver.close()
driver.quit()
