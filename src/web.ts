import { WebPlugin } from '@capacitor/core';

import { MapNavigationPlugin, NavigationOptions, PermissionStatus } from './definitions';

export class MapNavigationWeb extends WebPlugin implements MapNavigationPlugin {
  async startNavigation(options: NavigationOptions): Promise<void> {
    throw new Error('功能在此平台不可用'+JSON.stringify(options));
  }

  async checkPermissions(): Promise<PermissionStatus> {
    throw new Error('功能在此平台不可用');
  }

  async requestPermissions(): Promise<PermissionStatus> {
    throw new Error('功能在此平台不可用');
  }
}
