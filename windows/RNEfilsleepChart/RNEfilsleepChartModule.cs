using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Efilsleep.Chart.RNEfilsleepChart
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNEfilsleepChartModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNEfilsleepChartModule"/>.
        /// </summary>
        internal RNEfilsleepChartModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNEfilsleepChart";
            }
        }
    }
}
