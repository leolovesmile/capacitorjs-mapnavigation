package com.leolovesmile.capacitorjs.navigation;

import android.content.Intent;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.leolovesmile.capacitorjs.navigation.activity.DemoActivity;

@CapacitorPlugin(name = "MapNavigation")
public class MapNavigationPlugin extends Plugin {

    private MapNavigation implementation = new MapNavigation();

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }

    @PluginMethod
    public void startNavigation(PluginCall call){
        Float startLatitude = call.getFloat("startLatitude");
        Float startLongitude = call.getFloat("startLongitude");
        Float endLatitude = call.getFloat("endLatitude");
        Float endLongitude = call.getFloat("endLongitude");
        Boolean enableSimulate = call.getBoolean("enableSimulate", true);
        String directions = call.getString("directions");


        Intent intent = new Intent(this.getContext(), DemoActivity.class);
        getActivity().startActivity(intent);
        call.resolve();
    }
}
