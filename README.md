# @leolovesmile/capacitor-mapnavigation

This capacitorjs plugin is to add the mapbox map navigation capability to hybrid applications.

## Install

```bash
npm install @leolovesmile/capacitor-mapnavigation
npx cap sync
```

## API

<docgen-index>

* [`startNavigation(...)`](#startnavigation)
* [`checkPermissions()`](#checkpermissions)
* [`requestPermissions()`](#requestpermissions)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### startNavigation(...)

```typescript
startNavigation(options: NavigationOptions) => any
```

| Param         | Type                                                            |
| ------------- | --------------------------------------------------------------- |
| **`options`** | <code><a href="#navigationoptions">NavigationOptions</a></code> |

**Returns:** <code>any</code>

--------------------


### checkPermissions()

```typescript
checkPermissions() => any
```

**Returns:** <code>any</code>

--------------------


### requestPermissions()

```typescript
requestPermissions() => any
```

**Returns:** <code>any</code>

--------------------


### Interfaces


#### NavigationOptions

| Prop                 | Type                 |
| -------------------- | -------------------- |
| **`startLatitude`**  | <code>number</code>  |
| **`startLongitude`** | <code>number</code>  |
| **`endLatitude`**    | <code>number</code>  |
| **`endLongitude`**   | <code>number</code>  |
| **`enableSimulate`** | <code>boolean</code> |
| **`directions`**     | <code>string</code>  |


#### PermissionStatus

| Prop                | Type                                                                      |
| ------------------- | ------------------------------------------------------------------------- |
| **`mapNavigation`** | <code>"prompt" \| "prompt-with-rationale" \| "granted" \| "denied"</code> |

</docgen-api>


