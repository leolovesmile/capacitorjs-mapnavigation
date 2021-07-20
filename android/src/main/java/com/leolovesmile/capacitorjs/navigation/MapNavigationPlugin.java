package com.leolovesmile.capacitorjs.navigation;

import android.Manifest;
import android.content.Intent;

import com.getcapacitor.JSObject;
import com.getcapacitor.PermissionState;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.annotation.Permission;
import com.getcapacitor.annotation.PermissionCallback;
import com.leolovesmile.capacitorjs.navigation.activity.NavigationActivity;

@CapacitorPlugin(name = "MapNavigation", permissions = {
        @Permission(
                alias = "mapNavigation",
                strings = {
                        Manifest.permission.ACCESS_FINE_LOCATION,
                        Manifest.permission.ACCESS_COARSE_LOCATION,
                        Manifest.permission.ACCESS_BACKGROUND_LOCATION
                }
        )
})
public class MapNavigationPlugin extends Plugin {
    private static final int PERMISSION_REQUEST_CODE = 10081;

    private MapNavigation implementation = new MapNavigation();

    @PluginMethod
    public void startNavigation(PluginCall call) {
        if (getPermissionState("mapNavigation") != PermissionState.GRANTED) {
            requestPermissionForAlias("mapNavigation", call, "navigationPermsCallback");
        } else {
            Float startLatitude = call.getFloat("startLatitude");
            Float startLongitude = call.getFloat("startLongitude");
            Float endLatitude = call.getFloat("endLatitude");
            Float endLongitude = call.getFloat("endLongitude");
            Boolean enableSimulate = call.getBoolean("enableSimulate", true);
            String directions = call.getString("directions");

            Intent intent = new Intent(this.getContext(), NavigationActivity.class);
            intent.putExtra("startLng", startLongitude);
            intent.putExtra("startLat", startLatitude);
            intent.putExtra("endLng", endLongitude);
            intent.putExtra("endLat", endLatitude);
            intent.putExtra("enableSimulate", enableSimulate);
            intent.putExtra("directions", directions);

            getActivity().startActivity(intent);
            call.resolve();
        }
    }


    @PermissionCallback
    private void navigationPermsCallback(PluginCall call) {
        if (getPermissionState("mapNavigation") == PermissionState.GRANTED) {
            startNavigation(call);
        } else {
            call.reject("开启定位权限，并确保后台定位始终允许，才可启动导航服务", "412");
        }
    }
}
