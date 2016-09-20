package Reference;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewEmployeePage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "#dash a")
    @CacheLookup
    private WebElement dashBoard;

    @FindBy(css = "#emp a")
    @CacheLookup
    private WebElement employee;

    @FindBy(id = "btnlogout")
    @CacheLookup
    private WebElement employeeNewEmployeesSearchEmployeesDash;

    @FindBy(css = ".skin-blue.sidebar-mini div:nth-of-type(1) aside.main-sidebar section.sidebar ul:nth-of-type(1) li.treeview a")
    @CacheLookup
    private WebElement maddukuriNarayanaRao;

    @FindBy(css = "#tck ul.treeview-menu li:nth-of-type(1) a")
    @CacheLookup
    private WebElement myTickets;

    @FindBy(css = "#emp ul.treeview-menu.menu-open li:nth-of-type(1) a")
    @CacheLookup
    private WebElement newEmployees;

    @FindBy(css = "#tck ul.treeview-menu li:nth-of-type(2) a")
    @CacheLookup
    private WebElement newTicket;

    private final String pageLoadedText = "Resource Management &amp; Consultant Services";

    private final String pageUrl = "/portal_new/Start/Welcome.aspx";

    @FindBy(css = "#rep a")
    @CacheLookup
    private WebElement reports;

    @FindBy(css = "#dash ul.treeview-menu li:nth-of-type(1) a")
    @CacheLookup
    private WebElement rmDashBoard;

    @FindBy(css = "#dash ul.treeview-menu li:nth-of-type(3) a")
    @CacheLookup
    private WebElement rmNotifications;

    @FindBy(css = "#rep ul.treeview-menu li a")
    @CacheLookup
    private WebElement rmReports;

    @FindBy(css = "#emp ul.treeview-menu.menu-open li:nth-of-type(2) a")
    @CacheLookup
    private WebElement searchEmployees;

    @FindBy(css = "a[href='./logout.aspx']")
    @CacheLookup
    private WebElement signOut;

    @FindBy(css = "#dash ul.treeview-menu li:nth-of-type(2) a")
    @CacheLookup
    private WebElement statusWiseConsultants;

    @FindBy(css = "#tck a")
    @CacheLookup
    private WebElement tickets;

    @FindBy(css = "#tck ul.treeview-menu li:nth-of-type(4) a")
    @CacheLookup
    private WebElement ticketsByStatus;

    @FindBy(css = "a.sidebar-toggle")
    @CacheLookup
    private WebElement toggleNavigation;

    @FindBy(css = "#Li1 a")
    @CacheLookup
    private WebElement users;

    @FindBy(css = "#tck ul.treeview-menu li:nth-of-type(3) a")
    @CacheLookup
    private WebElement viewTickets;

    public NewEmployeePage() {
    }

    public NewEmployeePage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public NewEmployeePage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public NewEmployeePage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Dash Board Link.
     *
     * @return the NewEmployeePage class instance.
     */
    public NewEmployeePage clickDashBoardLink() {
        dashBoard.click();
        return this;
    }

    /**
     * Click on Employee Link.
     *
     * @return the NewEmployeePage class instance.
     */
    public NewEmployeePage clickEmployeeLink() {
        employee.click();
        return this;
    }

    /**
     * Click on Employee New Employees Search Employees Dash Board Rm Dash Board Button.
     *
     * @return the NewEmployeePage class instance.
     */
    public NewEmployeePage clickEmployeeNewEmployeesSearchEmployeesDashButton() {
        employeeNewEmployeesSearchEmployeesDash.click();
        return this;
    }

    /**
     * Click on Maddukuri Narayana Rao Link.
     *
     * @return the NewEmployeePage class instance.
     */
    public NewEmployeePage clickMaddukuriNarayanaRaoLink() {
        maddukuriNarayanaRao.click();
        return this;
    }

    /**
     * Click on My Tickets Link.
     *
     * @return the NewEmployeePage class instance.
     */
    public NewEmployeePage clickMyTicketsLink() {
        myTickets.click();
        return this;
    }

    /**
     * Click on New Employees Link.
     *
     * @return the NewEmployeePage class instance.
     */
    public NewEmployeePage clickNewEmployeesLink() {
        newEmployees.click();
        return this;
    }

    /**
     * Click on New Ticket Link.
     *
     * @return the NewEmployeePage class instance.
     */
    public NewEmployeePage clickNewTicketLink() {
        newTicket.click();
        return this;
    }

    /**
     * Click on Reports Link.
     *
     * @return the NewEmployeePage class instance.
     */
    public NewEmployeePage clickReportsLink() {
        reports.click();
        return this;
    }

    /**
     * Click on Rm Dash Board Link.
     *
     * @return the NewEmployeePage class instance.
     */
    public NewEmployeePage clickRmDashBoardLink() {
        rmDashBoard.click();
        return this;
    }

    /**
     * Click on Rm Notifications Link.
     *
     * @return the NewEmployeePage class instance.
     */
    public NewEmployeePage clickRmNotificationsLink() {
        rmNotifications.click();
        return this;
    }

    /**
     * Click on Rm Reports Link.
     *
     * @return the NewEmployeePage class instance.
     */
    public NewEmployeePage clickRmReportsLink() {
        rmReports.click();
        return this;
    }

    /**
     * Click on Search Employees Link.
     *
     * @return the NewEmployeePage class instance.
     */
    public NewEmployeePage clickSearchEmployeesLink() {
        searchEmployees.click();
        return this;
    }

    /**
     * Click on Sign Out Link.
     *
     * @return the NewEmployeePage class instance.
     */
    public NewEmployeePage clickSignOutLink() {
        signOut.click();
        return this;
    }

    /**
     * Click on Status Wise Consultants Link.
     *
     * @return the NewEmployeePage class instance.
     */
    public NewEmployeePage clickStatusWiseConsultantsLink() {
        statusWiseConsultants.click();
        return this;
    }

    /**
     * Click on Tickets By Status Link.
     *
     * @return the NewEmployeePage class instance.
     */
    public NewEmployeePage clickTicketsByStatusLink() {
        ticketsByStatus.click();
        return this;
    }

    /**
     * Click on Tickets Link.
     *
     * @return the NewEmployeePage class instance.
     */
    public NewEmployeePage clickTicketsLink() {
        tickets.click();
        return this;
    }

    /**
     * Click on Toggle Navigation Link.
     *
     * @return the NewEmployeePage class instance.
     */
    public NewEmployeePage clickToggleNavigationLink() {
        toggleNavigation.click();
        return this;
    }

    /**
     * Click on Users Link.
     *
     * @return the NewEmployeePage class instance.
     */
    public NewEmployeePage clickUsersLink() {
        users.click();
        return this;
    }

    /**
     * Click on View Tickets Link.
     *
     * @return the NewEmployeePage class instance.
     */
    public NewEmployeePage clickViewTicketsLink() {
        viewTickets.click();
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the NewEmployeePage class instance.
     */
    public NewEmployeePage submit() {
       // clickEmployeeNewEmployeesSearchEmployeesDashBoardRmDashBoardButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the NewEmployeePage class instance.
     */
    public NewEmployeePage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the NewEmployeePage class instance.
     */
    public NewEmployeePage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
