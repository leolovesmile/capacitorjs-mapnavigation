import type { PermissionState } from '@capacitor/core'

export interface MapNavigationPlugin {
  startNavigation(options: NavigationOptions): Promise<void>;

  checkPermissions(): Promise<PermissionStatus>;

  requestPermissions(): Promise<PermissionStatus>;
}


export interface NavigationOptions {
  startLatitude: number;
  startLongitude: number;
  endLatitude: number;
  endLongitude: number;
  enableSimulate:boolean;
  directions:string;
}

export interface PermissionStatus {
  mapNavigation: PermissionState;
}