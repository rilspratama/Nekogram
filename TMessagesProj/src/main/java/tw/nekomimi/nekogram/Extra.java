package tw.nekomimi.nekogram;

import java.util.function.BiConsumer;

import tw.nekomimi.nekogram.helpers.UserHelper;

public class Extra {
    // https://core.telegram.org/api/obtaining_api_id
    public static final int APP_ID = 13875777;
    public static final String APP_HASH = "28bac7e8ca985a86f48aadc28b1b3916";

    public static final String PLAYSTORE_APP_URL = "";

    public static String WS_USER_AGENT = "";
    public static String WS_CONN_HASH = "";
    public static String WS_DEFAULT_DOMAIN = "";

    public static boolean FORCE_ANALYTICS = false;

    public static String TLV_URL = "";

    public static long getOwnerFromStickerSetId(long id) {
        return 0;
    }

    public static void getRegDate(long userId, BiConsumer<Integer, String> callback) {

    }

    public static UserHelper.BotInfo getHelperBot() {
        return null;
    }

    public static UserHelper.UserInfoBot getUserInfoBot(boolean fallback) {
        return null;
    }

    public static boolean isTrustedBot(long id) {
        return id == WEBVIEW_BOT_ID;
    }
}
