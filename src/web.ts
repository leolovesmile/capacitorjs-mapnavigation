import { WebPlugin } from '@capacitor/core';

import type { MapNavigationPlugin } from './definitions';

export class MapNavigationWeb extends WebPlugin implements MapNavigationPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
