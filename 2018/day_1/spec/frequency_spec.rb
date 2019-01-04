require 'frequency'

RSpec.describe Frequency do
  it "matches the examples" do
    expect(Frequency.compute([1, 1, 1])).to eq(3)
    expect(Frequency.compute([1, 1, -2])).to eq(0)
    expect(Frequency.compute([-1, -2, -3])).to eq(-6)
  end
end
