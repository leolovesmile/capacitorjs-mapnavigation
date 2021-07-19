export interface MapNavigationPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;

  startNavigation(options: NavigationOptions): Promise<void>;
}


export interface NavigationOptions {
  startLatitude: number;
  startLongitude: number;
  endLatitude: number;
  endLongitude: number;
  enableSimulate:boolean;
  directions:string;
}