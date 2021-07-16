export interface MapNavigationPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
