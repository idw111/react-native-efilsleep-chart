
# react-native-efilsleep-chart

## Getting started

`$ npm install react-native-efilsleep-chart --save`

### Mostly automatic installation

`$ react-native link react-native-efilsleep-chart`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-efilsleep-chart` and add `RNEfilsleepChart.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNEfilsleepChart.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNEfilsleepChartPackage;` to the imports at the top of the file
  - Add `new RNEfilsleepChartPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-efilsleep-chart'
  	project(':react-native-efilsleep-chart').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-efilsleep-chart/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-efilsleep-chart')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNEfilsleepChart.sln` in `node_modules/react-native-efilsleep-chart/windows/RNEfilsleepChart.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Efilsleep.Chart.RNEfilsleepChart;` to the usings at the top of the file
  - Add `new RNEfilsleepChartPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNEfilsleepChart from 'react-native-efilsleep-chart';

// TODO: What to do with the module?
RNEfilsleepChart;
```
  