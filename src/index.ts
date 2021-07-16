import { registerPlugin } from '@capacitor/core';

import type { MapNavigationPlugin } from './definitions';

const MapNavigation = registerPlugin<MapNavigationPlugin>('MapNavigation', {
  web: () => import('./web').then(m => new m.MapNavigationWeb()),
});

export * from './definitions';
export { MapNavigation };
