import { WebPlugin } from '@capacitor/core';

import { MapNavigationPlugin, NavigationOptions, PermissionStatus } from './definitions';

export class MapNavigationWeb extends WebPlugin implements MapNavigationPlugin {
  constructor() {
    super({
      name: 'MapNavigationPlugin',
      platforms: ['web', 'android']
    });
  }

  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return {value: 'hello '+options.value};
  }
  
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
