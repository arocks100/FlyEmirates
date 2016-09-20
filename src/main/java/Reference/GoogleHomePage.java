package Reference;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleHomePage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='//www.google.co.in/intl/en/about.html?fg=1']")
    @CacheLookup
    private WebElement about;

    @FindBy(css = "a.gb_za.gb_Je")
    @CacheLookup
    private WebElement addAShortcut;

    @FindBy(css = "a.gb_Fa.gb_De.gb_vb")
    @CacheLookup
    private WebElement addAccount;

    @FindBy(css = "a[href='/advanced_search?hl=en-IN&fg=1']")
    @CacheLookup
    private WebElement advancedSearch;

    @FindBy(css = "a[href='//www.google.co.in/intl/en/ads/?fg=1']")
    @CacheLookup
    private WebElement advertising;

    @FindBy(css = "a.gb_Kb.gb_6a")
    @CacheLookup
    private WebElement allYourGooglePages;

    @FindBy(id = "gb30")
    @CacheLookup
    private WebElement blogger;

    @FindBy(id = "gb10")
    @CacheLookup
    private WebElement books;

    @FindBy(css = "a[href='//www.google.co.in/services/?fg=1']")
    @CacheLookup
    private WebElement business;

    @FindBy(id = "gb24")
    @CacheLookup
    private WebElement calendar;

    @FindBy(css = "a.gb_ob.gb_Je.gb_qb")
    @CacheLookup
    private WebElement change;

    @FindBy(id = "gb53")
    @CacheLookup
    private WebElement contacts;

    @FindBy(id = "gb25")
    @CacheLookup
    private WebElement docs;

    @FindBy(id = "gb49")
    @CacheLookup
    private WebElement drive;

    @FindBy(id = "hotword__chw-oe")
    @CacheLookup
    private WebElement enableOkGoogle;

    @FindBy(css = "a.gb_la.gb_Ce")
    @CacheLookup
    private WebElement evenMoreFromGoogle;

    @FindBy(css = "a.gb_Bb.gb_Eb")
    @CacheLookup
    private WebElement ghostTesterghostester999gmailComDefault;

    @FindBy(css = "#gbw div div.gb_hb.gb_wf.gb_R.gb_vf.gb_zf.gb_T div:nth-of-type(1) div:nth-of-type(2) a.gb_P")
    @CacheLookup
    private WebElement gmail1;

    @FindBy(id = "gb23")
    @CacheLookup
    private WebElement gmail2;

    @FindBy(id = "gb119")
    @CacheLookup
    private WebElement google1;

    @FindBy(id = "logo")
    @CacheLookup
    private WebElement google2;

    @FindBy(name = "btnK")
    @CacheLookup
    private WebElement googleSearch;

    @FindBy(id = "gb300")
    @CacheLookup
    private WebElement hangouts;

    @FindBy(css = "#chm div:nth-of-type(2) div:nth-of-type(3) a:nth-of-type(2)")
    @CacheLookup
    private WebElement help;

    @FindBy(css = "a[href='/history?hl=en-IN&fg=1']")
    @CacheLookup
    private WebElement history;

    @FindBy(name = "btnI")
    @CacheLookup
    private WebElement imFeelingLucky;

    @FindBy(css = "a[href='https://www.google.co.in/imghp?hl=en&tab=wi&ei=JprhV9unIMG_0ASm8YewBw&ved=0EKouCBMoAQ']")
    @CacheLookup
    private WebElement images;

    @FindBy(css = "a[href='//support.google.com/websearch/answer/186645?hl=en-IN']")
    @CacheLookup
    private WebElement learnMore1;

    @FindBy(css = "a[href='https://support.google.com/chrome/?p=ui_hotword_search']")
    @CacheLookup
    private WebElement learnMore2;

    @FindBy(id = "gb8")
    @CacheLookup
    private WebElement maps;

    @FindBy(css = "a.gb_ka.gb_Je")
    @CacheLookup
    private WebElement more;

    @FindBy(id = "gb192")
    @CacheLookup
    private WebElement myAccount1;

    @FindBy(css = "a.gb_Fa.gb_Fe.gbp1.gb_vb")
    @CacheLookup
    private WebElement myAccount2;

    @FindBy(id = "gb5")
    @CacheLookup
    private WebElement news;

    @FindBy(id = "hotword__chw-on")
    @CacheLookup
    private WebElement noThanks;

    private final String pageLoadedText = "Screen-reader users, click here to turn off Google Instant";

    private final String pageUrl = "/webhp?hl=en&sa=X&ved=0ahUKEwjS54jS4p7PAhWFJ5QKHVL6AnQQPAgD";

    @FindBy(id = "gb31")
    @CacheLookup
    private WebElement photos;

    @FindBy(id = "gb78")
    @CacheLookup
    private WebElement play;

    @FindBy(css = "a[href='http://www.google.co.in/intl/en/policies/privacy/']")
    @CacheLookup
    private WebElement privacy1;

    @FindBy(css = "a[href='//www.google.co.in/intl/en/policies/privacy/?fg=1']")
    @CacheLookup
    private WebElement privacy2;

    @FindBy(css = "#chm div:nth-of-type(2) div:nth-of-type(3) a:nth-of-type(1)")
    @CacheLookup
    private WebElement restartListening;

    @FindBy(id = "lst-ib")
    @CacheLookup
    private WebElement restartListeninghelphotwordDetectionIsOff1;

    @FindBy(id = "gs_taif0")
    @CacheLookup
    private WebElement restartListeninghelphotwordDetectionIsOff2;

    @FindBy(id = "gs_htif0")
    @CacheLookup
    private WebElement restartListeninghelphotwordDetectionIsOff3;

    @FindBy(css = "a[href='/setprefs?suggon=2&prev=https://www.google.co.in/webhp?hl%3Den%26sa%3DX%26ved%3D0ahUKEwjS54jS4p7PAhWFJ5QKHVL6AnQQPAgD&sig=0_rmdIXPM_MK193DI8ZtobfoLvNPI%3D']")
    @CacheLookup
    private WebElement screenreaderUsersClickHereToTurn1;

    @FindBy(id = "csi")
    @CacheLookup
    private WebElement screenreaderUsersClickHereToTurn2;

    @FindBy(id = "gb1")
    @CacheLookup
    private WebElement search;

    @FindBy(css = "a[href='//support.google.com/websearch/?p=ws_results_help&hl=en-IN&fg=1']")
    @CacheLookup
    private WebElement searchHelp;

    @FindBy(css = "a[href='https://www.google.co.in/preferences?hl=en-IN&fg=1']")
    @CacheLookup
    private WebElement searchSettings;

    @FindBy(id = "_Yvd")
    @CacheLookup
    private WebElement sendFeedback;

    @FindBy(id = "fsettl")
    @CacheLookup
    private WebElement settings;

    @FindBy(id = "gb_71")
    @CacheLookup
    private WebElement signOut;

    @FindBy(css = "#chm div:nth-of-type(3) div a")
    @CacheLookup
    private WebElement startListeningForOkGoogle;

    @FindBy(css = "a[href='//www.google.co.in/intl/en/policies/terms/?fg=1']")
    @CacheLookup
    private WebElement terms;

    @FindBy(id = "gb51")
    @CacheLookup
    private WebElement translate;

    @FindBy(id = "gb36")
    @CacheLookup
    private WebElement youtube;

    public GoogleHomePage() {
    }

    public GoogleHomePage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public GoogleHomePage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public GoogleHomePage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickAboutLink() {
        about.click();
        return this;
    }

    /**
     * Click on Add A Shortcut Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickAddAShortcutLink() {
        addAShortcut.click();
        return this;
    }

    /**
     * Click on Add Account Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickAddAccountLink() {
        addAccount.click();
        return this;
    }

    /**
     * Click on Advanced Search Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickAdvancedSearchLink() {
        advancedSearch.click();
        return this;
    }

    /**
     * Click on Advertising Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickAdvertisingLink() {
        advertising.click();
        return this;
    }

    /**
     * Click on All Your Google Pages Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickAllYourGooglePagesLink() {
        allYourGooglePages.click();
        return this;
    }

    /**
     * Click on Blogger Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickBloggerLink() {
        blogger.click();
        return this;
    }

    /**
     * Click on Books Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickBooksLink() {
        books.click();
        return this;
    }

    /**
     * Click on Business Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickBusinessLink() {
        business.click();
        return this;
    }

    /**
     * Click on Calendar Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickCalendarLink() {
        calendar.click();
        return this;
    }

    /**
     * Click on Change Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickChangeLink() {
        change.click();
        return this;
    }

    /**
     * Click on Contacts Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickContactsLink() {
        contacts.click();
        return this;
    }

    /**
     * Click on Docs Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickDocsLink() {
        docs.click();
        return this;
    }

    /**
     * Click on Drive Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickDriveLink() {
        drive.click();
        return this;
    }

    /**
     * Click on Enable Ok Google Button.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickEnableOkGoogleButton() {
        enableOkGoogle.click();
        return this;
    }

    /**
     * Click on Even More From Google Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickEvenMoreFromGoogleLink() {
        evenMoreFromGoogle.click();
        return this;
    }

    /**
     * Click on Ghost Testerghostester999gmail.com Default Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickGhostTesterghostester999gmailComDefaultLink() {
        ghostTesterghostester999gmailComDefault.click();
        return this;
    }

    /**
     * Click on Gmail Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickGmail1Link() {
        gmail1.click();
        return this;
    }

    /**
     * Click on Gmail Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickGmail2Link() {
        gmail2.click();
        return this;
    }

    /**
     * Click on Google Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickGoogle1Link() {
        google1.click();
        return this;
    }

    /**
     * Click on Google Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickGoogle2Link() {
        google2.click();
        return this;
    }

    /**
     * Click on Google Search Button.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickGoogleSearchButton() {
        googleSearch.click();
        return this;
    }

    /**
     * Click on Hangouts Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickHangoutsLink() {
        hangouts.click();
        return this;
    }

    /**
     * Click on Help Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickHelpLink() {
        help.click();
        return this;
    }

    /**
     * Click on History Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickHistoryLink() {
        history.click();
        return this;
    }

    /**
     * Click on Im Feeling Lucky Button.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickImFeelingLuckyButton() {
        imFeelingLucky.click();
        return this;
    }

    /**
     * Click on Images Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickImagesLink() {
        images.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickLearnMore1Link() {
        learnMore1.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickLearnMore2Link() {
        learnMore2.click();
        return this;
    }

    /**
     * Click on Maps Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickMapsLink() {
        maps.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickMoreLink() {
        more.click();
        return this;
    }

    /**
     * Click on My Account Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickMyAccount1Link() {
        myAccount1.click();
        return this;
    }

    /**
     * Click on My Account Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickMyAccount2Link() {
        myAccount2.click();
        return this;
    }

    /**
     * Click on News Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickNewsLink() {
        news.click();
        return this;
    }

    /**
     * Click on No Thanks Button.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickNoThanksButton() {
        noThanks.click();
        return this;
    }

    /**
     * Click on Photos Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickPhotosLink() {
        photos.click();
        return this;
    }

    /**
     * Click on Play Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickPlayLink() {
        play.click();
        return this;
    }

    /**
     * Click on Privacy Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickPrivacy1Link() {
        privacy1.click();
        return this;
    }

    /**
     * Click on Privacy Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickPrivacy2Link() {
        privacy2.click();
        return this;
    }

    /**
     * Click on Restart Listening Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickRestartListeningLink() {
        restartListening.click();
        return this;
    }

    /**
     * Click on Search Help Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickSearchHelpLink() {
        searchHelp.click();
        return this;
    }

    /**
     * Click on Search Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickSearchLink() {
        search.click();
        return this;
    }

    /**
     * Click on Search Settings Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickSearchSettingsLink() {
        searchSettings.click();
        return this;
    }

    /**
     * Click on Send Feedback Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickSendFeedbackLink() {
        sendFeedback.click();
        return this;
    }

    /**
     * Click on Settings Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickSettingsLink() {
        settings.click();
        return this;
    }

    /**
     * Click on Sign Out Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickSignOutLink() {
        signOut.click();
        return this;
    }

    /**
     * Click on Start Listening For Ok Google Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickStartListeningForOkGoogleLink() {
        startListeningForOkGoogle.click();
        return this;
    }

    /**
     * Click on Terms Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickTermsLink() {
        terms.click();
        return this;
    }

    /**
     * Click on Translate Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickTranslateLink() {
        translate.click();
        return this;
    }

    /**
     * Click on Youtube Link.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage clickYoutubeLink() {
        youtube.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage fill() {
        setScreenreaderUsersClickHereToTurn2TextareaField();
        setRestartListeninghelphotwordDetectionIsOff1TextField();
        setRestartListeninghelphotwordDetectionIsOff2TextField();
        setRestartListeninghelphotwordDetectionIsOff3TextField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Restart Listeninghelphotword Detection Is Off Text field.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage setRestartListeninghelphotwordDetectionIsOff1TextField() {
        return setRestartListeninghelphotwordDetectionIsOff1TextField(data.get("RESTART_LISTENINGHELPHOTWORD_DETECTION_IS_OFF_1"));
    }

    /**
     * Set value to Restart Listeninghelphotword Detection Is Off Text field.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage setRestartListeninghelphotwordDetectionIsOff1TextField(String restartListeninghelphotwordDetectionIsOff1Value) {
        restartListeninghelphotwordDetectionIsOff1.sendKeys(restartListeninghelphotwordDetectionIsOff1Value);
        return this;
    }

    /**
     * Set default value to Restart Listeninghelphotword Detection Is Off Text field.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage setRestartListeninghelphotwordDetectionIsOff2TextField() {
        return setRestartListeninghelphotwordDetectionIsOff2TextField(data.get("RESTART_LISTENINGHELPHOTWORD_DETECTION_IS_OFF_2"));
    }

    /**
     * Set value to Restart Listeninghelphotword Detection Is Off Text field.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage setRestartListeninghelphotwordDetectionIsOff2TextField(String restartListeninghelphotwordDetectionIsOff2Value) {
        restartListeninghelphotwordDetectionIsOff2.sendKeys(restartListeninghelphotwordDetectionIsOff2Value);
        return this;
    }

    /**
     * Set default value to Restart Listeninghelphotword Detection Is Off Text field.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage setRestartListeninghelphotwordDetectionIsOff3TextField() {
        return setRestartListeninghelphotwordDetectionIsOff3TextField(data.get("RESTART_LISTENINGHELPHOTWORD_DETECTION_IS_OFF_3"));
    }

    /**
     * Set value to Restart Listeninghelphotword Detection Is Off Text field.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage setRestartListeninghelphotwordDetectionIsOff3TextField(String restartListeninghelphotwordDetectionIsOff3Value) {
        restartListeninghelphotwordDetectionIsOff3.sendKeys(restartListeninghelphotwordDetectionIsOff3Value);
        return this;
    }

    /**
     * Set default value to Screenreader Users Click Here To Turn Off Google Instant Textarea field.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage setScreenreaderUsersClickHereToTurn1TextareaField() {
        return setScreenreaderUsersClickHereToTurn1TextareaField(data.get("SCREENREADER_USERS_CLICK_HERE_TO_TURN_1"));
    }

    /**
     * Set value to Screenreader Users Click Here To Turn Off Google Instant Textarea field.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage setScreenreaderUsersClickHereToTurn1TextareaField(String screenreaderUsersClickHereToTurn1Value) {
        screenreaderUsersClickHereToTurn1.click();
        return this;
    }

    /**
     * Set default value to Screenreader Users Click Here To Turn Off Google Instant Textarea field.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage setScreenreaderUsersClickHereToTurn2TextareaField() {
        return setScreenreaderUsersClickHereToTurn2TextareaField(data.get("SCREENREADER_USERS_CLICK_HERE_TO_TURN_2"));
    }

    /**
     * Set value to Screenreader Users Click Here To Turn Off Google Instant Textarea field.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage setScreenreaderUsersClickHereToTurn2TextareaField(String screenreaderUsersClickHereToTurn2Value) {
        screenreaderUsersClickHereToTurn2.sendKeys(screenreaderUsersClickHereToTurn2Value);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage submit() {
        clickImFeelingLuckyButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage verifyPageLoaded() {
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
     * @return the GoogleHomePage class instance.
     */
    public GoogleHomePage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
