import { WebPlugin } from '@capacitor/core';

import { MapNavigationPlugin, NavigationOptions } from './definitions';

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
  
  startNavigation(options: NavigationOptions): Promise<void> {
    throw new Error('功能在此平台不可用'+JSON.stringify(options));
  }
}
