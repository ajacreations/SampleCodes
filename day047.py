#code by Harjaspreet Singh
#Scraing data from twitter profile using bs4 and selenium
#To run this on your computer follow the following steps:-
#1 install chrome driver matching with your chrome version and update the path in line 15
#2 install the required libraries and you are all set to go
#**** WAIT FOR ATLEAST 7 SECONDS FOR THE OUTPUT TO LOAD ****
from bs4 import BeautifulSoup
from selenium.webdriver import ChromeOptions
import time
from selenium.webdriver.chrome.service import Service
from selenium import webdriver

user=input("Enter your username: @")
#settingup the bridge using selenuim to get the entered users profile
ser=Service(r'C:\Users\singh\Downloads\chromedriver_win32\chromedriver.exe')
options = ChromeOptions()
options.headless = True
driver = webdriver.Chrome( options=options,service=ser)
driver.get(f'https://twitter.com/{user}')
#waiting so that the whole page gets loaded: being a dynamic site we need to wait for its jscontent to be extracted
time.sleep(5)
soup = BeautifulSoup(driver.page_source, "html.parser")
#finding data in all the span tags using bs4
all = soup.find_all('span')
#Extracting data from the loaded webpage
a = 0
dict = {
    "Name": all[12].text,
    "UserName": all[20].text,
    "Bio": all[21].text,
    "ProfileLink": f'https://twitter.com/{user}',
}
for i in all:
    if (i.text == 'Following'):
        dict["Following"] = all[a - 1].text
        dict["Followers"] = all[a + 2].text
        break
    a += 1
#Printing out all the scraped data
for key in dict:
    print(f'{key} : {dict[key]}')