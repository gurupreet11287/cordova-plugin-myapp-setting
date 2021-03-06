package cordova.plugins;

import android.content.Intent;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class MyAppSetting extends CordovaPlugin {
    public DateSetting() {}

    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        try {
            if (action.equals("open")){
                cordova.getActivity().startActivity(new Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS));
                callbackContext.success();
            }else {
                callbackContext.error("Invalid action");
                return false;
            }
        }catch(Exception e ) {
            callbackContext.error("Exception occurred: ".concat(e.getMessage()));
            return false;
        }
        return true;
    }
}